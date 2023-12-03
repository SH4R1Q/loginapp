import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BackendService } from '../../Services/backend.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';


@Component({
  selector: 'app-login-page',
  standalone: true,
  imports: [FormsModule,HttpClientModule],
  templateUrl: './login-page.component.html',
  styleUrl: './login-page.component.css'
})
export class LoginPageComponent {
  data = {
    userName:"",
    password:""
  }
  private baseUrl: String = "http://localhost:8080"

  constructor(private http: HttpClient){}
  btnClick(){
    (this.data.userName.length===0 || this.data.password.length===0)?console.log("error"):
    this.http.post(`${this.baseUrl}/login`, this.data).subscribe(
      response=>{
        console.log(response);
      },
      error=>{
        console.log(error);
      }
    );
  }
}
