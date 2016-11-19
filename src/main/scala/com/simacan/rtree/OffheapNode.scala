package com.simacan.rtree

import scala.offheap._

trait OffheapNode extends Any {
  sizeOfEmbed[OHCoord]
}

@data class OHCoord(var x: Short, var y: Short)