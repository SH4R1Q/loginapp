import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BackendService } from '../../Services/backend.service';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-login-page',
  standalone: true,
  imports: [FormsModule,HttpClientModule],
  templateUrl: './login-page.component.html',
  styleUrl: './login-page.component.css'
})
export class LoginPageComponent {
  data = {
    username:"",
    password:""
  }
  constructor(private details:BackendService){}
  btnClick(){
    (this.data.username.length===0 || this.data.password.length===0)?console.log("error"):
    this.details.sendDetails(this.data).subscribe(
      response=>{
        console.log(response);
      },
      error=>{
        console.log(error);
      }
    );
  }
}
