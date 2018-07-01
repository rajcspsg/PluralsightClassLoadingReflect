There are multiple types of classloader

1. Base classloader
2. extension classloader
3. Delegate classloader

These classloader typically exists as hierarchy. All classloaders has parent apart from base classloader.

Classloader may delegate the classloading to its parent. parent may load the class. Remember parent may not load the class.

Classloading Rules

Typically classloader loads the class once and it is cached. During second time the loaded class is returned.
This is the behavior of built in class loaded.

The 3 types of class loaded are 

1. Bootstrap - written in C
2. extension -
3. Application - Loads application class files.



