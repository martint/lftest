Building
========

Make sure you have Java 7+ and maven 3 installed and run:

    mvn install

Running
=======

Run the following:

    java -verbose:class -Djava.lang.invoke.MethodHandle.DUMP_CLASS_FILES=true -jar target/lftest-1.0-SNAPSHOT-standalone.jar

You'll see a bunch of output with this shape:

    [Loaded java.lang.invoke.LambdaForm$MH/1937962514 from java.lang.invoke.LambdaForm]
    [Loaded Runnable_18 from __JVM_DefineClass__]
    [Loaded java.lang.invoke.LambdaForm$MH/662441761 from java.lang.invoke.LambdaForm]
    [Loaded Runnable_19 from __JVM_DefineClass__]
    [Loaded java.lang.invoke.LambdaForm$MH/804611486 from java.lang.invoke.LambdaForm]
    [Loaded Runnable_20 from __JVM_DefineClass__]
    [Loaded java.lang.invoke.LambdaForm$MH/1761061602 from java.lang.invoke.LambdaForm]
    [Loaded Runnable_21 from __JVM_DefineClass__]
    [Loaded java.lang.invoke.LambdaForm$MH/766572210 from java.lang.invoke.LambdaForm]
    ...
