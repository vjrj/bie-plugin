runWithNoExternalConfig = true
projectNameShort = "Atlas"
projectName = "Atlas of Living Australia"
bie.baseURL = "http://localhost:8080/bie-plugin"
bie.searchPath = "/search"
//biocache.baseURL = "http://biocache.ala.org.au"
//biocacheService.baseURL = "http://biocache.ala.org.au/ws"
biocache.baseURL = "http://biocache-aws.ala.org.au/biocache"
biocacheService.baseURL = "http://biocache-aws.ala.org.au/biocache-service"
biocacheService.queryContext = ""
spatial.baseURL = "http://spatial.ala.org.au"
ala.baseURL = "http://www.ala.org.au"
collectory.baseURL = "http://collections.ala.org.au"
regions.baseURL = "http://regions.ala.org.au"
bhl.baseURL = "http://bhlidx.ala.org.au"
//speciesList.baseURL = "http://lists.ala.org.au"
speciesList.baseURL = "http://bie-aws.ala.org.au/lists"
alerts.baseUrl = "http://alerts.ala.org.au/ws/"
sightings.guidUrl = "http://sightings.ala.org.au/"
collectory.threatenedSpeciesCodesUrl = collectory.baseURL + "/public/showDataResource"
skin.layout = "generic"
eol.lang = "en"
bie.index.url = "http://bie-aws.ala.org.au/bie-index"
defaultDecimalLatitude=-25.61
defaultDecimalLongitude=134.35
defaultZoomLevel=4
image.thumbnailUrl = "http://images.ala.org.au/image/proxyImageThumbnail?imageId="
facets = "idxtype,rank,locatedInHubCountry,imageAvailable,speciesGroup"
map.default.id = "" // not needed for CartoDB map
map.default.token = "" // not needed for CartoDB map
map.default.url = "http://{s}.basemaps.cartocdn.com/light_all/{z}/{x}/{y}.png"
map.default.attr = "Map data &copy; <a href='http://www.openstreetmap.org/copyright'>OpenStreetMap</a>, imagery &copy; <a href='http://cartodb.com/attributions'>CartoDB</a>"
map.default.domain = "abcd"
map.records.colour = "e6704c"
bieService.queryContext = ""
googleMapsApiKey = "AIzaSyB0HIkSCV2EdkG50uM7s96IEbO6wUHTqy0"
languageCodesUrl = defaultConfig.class.getResource("/languages.json").toString()

