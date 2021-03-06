import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Login } from '../login';
import { LoginService } from '../login.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _fb : FormBuilder , private _loginService : LoginService) { }

  loginForm : FormGroup

  ngOnInit() {

    this.loginForm = this._fb.group({
      username : [''],
      password : [''],
    })
  }


  login(loginDetails: Login){
    console.log('login clicked');
    console.log(loginDetails);
    this._loginService.login(loginDetails).subscribe( (resposne) => {
        console.log('Hello world');
    });
  }

}
