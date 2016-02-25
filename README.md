# A light weight, Java library of useful methods

This repo contains Java src code of useful methods and classes frequently used in my projects (and some of you may find them handy :). Some places in this library make use of some methods from the popular _Commons Math_ library from Apache (huge thanks to developer team of Commons Math), so remember to include their library in your project when you use mine. Your feedback are warmly welcome. If you like my library, do not hesitate to fork it. Clicking on __Star__ button is greatly appreciated.

Most useful classes include:

+ `SetOps` for set operations with high-level, mathematical method names (_union_, _intersection_, ...). The methods are also generic, which allow you to pass sets of any type. Thus, it is very convenient to use them.

+ `ArrayOps` for common array operations such as finding the index of smallest/largest element. The methods follow R-style naming e.g. `whichMin()`.

+ `Savers` for _compact, one-line_ wrappers for various save operations. The wrappers already take care of those details of declaring a buffered writer, closing the output file after saving,... so you can focus on what you want to save instead of worrying about technical details of how to do it.

+ `Converters` for various conversions (e.g. array to vector, list of vectors to a matrix,...)

+ `Summary` for handy summary operations (_sum_, _mean_, _max_,...) over collections. `max()`, `min()` methods are generic, they accept any collection of _Comparable_ objects.

This library is still being developed. More useful stuffs will be added ASAP.
