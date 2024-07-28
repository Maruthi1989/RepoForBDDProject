pipeline
{
   agent any
   stages
   {
    stage(build)
    {
      steps
      {
        echo "Building the code......."
        bat "mvn clean"
      }  
    } 
    
    stage(test)
    { 
      steps
      {
        echo "Testing the code......."
        bat "mvn test"
      }   
    }
    
    stage(compile)
    {
      steps
      {
        echo "compiling the code...."
        bat "mvn compile"
      }  
    }
    
    stage(install)
    {
      
      steps
      {
        echo "installing the project...."
        echo "Installing the project to local repo....."
        bat "mvn install"
       }
     }  
    }
  }            
