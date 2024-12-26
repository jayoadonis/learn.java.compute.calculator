plugins {
  id("application")
}

project.version="0.0.0"
project.group="learn.java.compute"

project.java {
  this.modularity.inferModulePath.set(true)
}

project.application {
  this.mainClass.set(
    "${project.group}.${project.name.replace('-','_')}.Main"
  )
  this.mainModule.set(
    "${project.group}.\${project.name.replace('-','_')"
  )
}

project.dependencies {

}

project.tasks.test {
  useJUnitPlatform();
}