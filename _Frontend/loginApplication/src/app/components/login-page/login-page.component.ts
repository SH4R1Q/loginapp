import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-login-page',
  standalone: true,
  imports: [FormsModule,HttpClientModule,CommonModule],
  templateUrl: './login-page.component.html',
  styleUrl: './login-page.component.css'
})
export class LoginPageComponent {
  data = {
    userName:"",
    password:""
  }
  flag:boolean = false
  private baseUrl: String = "http://localhost:8080"

  constructor(private http: HttpClient){}
  btnClick(){
    (this.data.userName.length===0 || this.data.password.length===0)?console.log("error"):
    this.http.post(`${this.baseUrl}/login`, this.data).subscribe(
      (response:any)=>{
        if(!(response.password===null)){
          window.location.href="/home"
          this.flag = false;
        }
        else{
          this.flag = true;
        }
      },
      error=>{
        console.log(error);
      }
    );
  }
}
