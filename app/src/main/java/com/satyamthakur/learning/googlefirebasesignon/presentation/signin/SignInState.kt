package com.satyamthakur.learning.googlefirebasesignon.presentation.signin

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)