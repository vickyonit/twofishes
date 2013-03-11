//  Copyright 2012 Foursquare Labs Inc. All Rights Reserved
package com.foursquare.twofishes.batch

import com.foursquare.twofishes.importers.geonames._
import com.foursquare.twofishes._
import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.dao._
import com.novus.salat.global._
import com.vividsolutions.jts.geom.Geometry
import com.vividsolutions.jts.io.{WKBWriter, WKTReader}

object UpdatePolys {
  def main(args: Array[String]) {
    val store = new MongoGeocodeStorageService()
    PolygonLoader.load(store, GeonamesParser.geonameIdNamespace)
  }
}