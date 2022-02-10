import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Tarea } from './tarea';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class TareaService {
  private apiServerUrl = environment.apiBaseUrl;
  
  constructor(private http: HttpClient) { }
  
  public getListTarea(): Observable<Tarea[]> {
    return this.http.get<Tarea[]>(`${this.apiServerUrl}/rest/findAllTareas`);
  }
  
  public addTarea(tarea: Tarea): Observable<Tarea> {
    return this.http.post<Tarea>(`${this.apiServerUrl}/rest/saveTarea`, tarea);
  }

  public updateDescripcion(tarea: Tarea): Observable<Tarea> {
    return this.http.put<Tarea>(`${this.apiServerUrl}/rest/updateDescripcionTarea`, tarea);
  }

  public confirmTarea(tarea: Tarea): Observable<Tarea> {
    return this.http.put<Tarea>(`${this.apiServerUrl}/rest/confirmEstadoTarea`, tarea);
  }

  public deleteTarea(idTarea: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/rest/deleteTareaByID/${idTarea}`);
  }

}