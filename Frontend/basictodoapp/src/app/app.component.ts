import { Component, OnInit } from '@angular/core';
import { Tarea } from './tarea';
import { TareaService } from './tarea.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit{
  public tareas: Tarea[];

  constructor(private tareaService: TareaService) { }

  ngOnInit() {
    this.getTareas();
  }

  public getTareas(): void {
    this.tareaService.getListTarea().subscribe(
      (response: Tarea[]) => {
        this.tareas = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
