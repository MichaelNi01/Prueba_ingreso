#Author: Michael Niño

@tag
Feature: Prueba de ingreso

  @tag1
  Scenario Outline: Validar creacion nuevo post
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar addnew
    And Ingresar <titulo> 
    And publicar y ver resultado
    Then Validar la informacion <titulo> 
   
    Examples: 
      | usuario            | password               | titulo         | 
      | "opensourcecms"    |     "opensourcecms"    |  "test case 1" | 

  @tag2
  Scenario Outline: Validar login
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    Then Validar login

    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |
  
	@tag3
  Scenario Outline: Validar opciones modulos post
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    Then Validar opciones de el modulo post

    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |
      
  @tag4
  Scenario Outline: Validar ingreso a la opcion allpost
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion allpost
    Then Validar ingreso a la opcion allpost
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |
      
  @tag5
  Scenario Outline: Validar ingreso a la opcion addnew
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion addnew
    Then Validar ingreso a la opcion addnew
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |
      
      
  @tag6
  Scenario Outline: Validar ingreso a la opcion categories
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion categories
    Then Validar ingreso a la opcion categories
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |
      
  @tag7
  Scenario Outline: Validar ingreso a la opcion tags
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion tags
    Then Validar ingreso a la opcion tags
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |     
      
  @tag8
  Scenario Outline: Validar que cargan todos los post
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion allpost
    Then Validar que cargan todos los post
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |   
      
  @tag9
  Scenario Outline: Validar acciones masivas
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion allpost
    And Seleccionar mas de un post
    And Seleccionar una accion masiva y dar click en apply
    Then validar que se aplico la accion
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |  
      
  @tag10
  Scenario Outline: Validar que elimina un posts
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar la opcion allpost
    And Eliminar un post
    Then validar que se elimino
    
    Examples: 
      | usuario            | password               | 
      | "opensourcecms"    |     "opensourcecms"    |  
      
  @tag11
  Scenario Outline: Validar edicion de un post
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Editar post
    And Ingresar nuevo <titulo>>
    And Publicar
    Then Validar nueva informacion <titulo> 
   
    Examples: 
      | usuario            | password               | titulo	   |
      | "opensourcecms"    |     "opensourcecms"    | "DDDDDDDDD"| 
   
  @tag12
  Scenario Outline: Validar aplicacion filtro
    Given Abrir navegador e ingresar a la pagina Web
    And Ingresar usuario <usuario>
    When Ingresar <password> y hacer login
    And Hacer click en el modulo post
    And Seleccionar fecha
    And Aplicar filtro
    Then Validar filtro
   
    Examples: 
      | usuario            | password               |
      | "opensourcecms"    |     "opensourcecms"    |     
      
 
      