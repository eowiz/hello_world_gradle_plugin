package eowiz.gradle.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloWorldGradlePlugin implements Plugin<Project> {

  @Override
  public void apply(Project project) {
    project.task("hello").doFirst(task -> {
      System.out.println("Hello, World!");
    });
  }
}
