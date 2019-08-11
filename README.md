# Demonstration of Grep Maven Plugin

See https://codingcraftsman.wordpress.com/2019/08/11/crossing-the-junit-streams/ for
a full explanation of this example and why this was the optimum solution.

This uses the plugin https://github.com/radai-rosenblatt/grep-maven-plugin to
scan tests for accidental use of imports from `JUnit 4` in a project
where those tests would not be run.