## Reference

The following keys are supported for use with the `random` helper:

### Category - Base

#### Key - Address

```handlebars
{{ random 'Address.state' }}
{{ random 'Address.country' }}
{{ random 'Address.streetName' }}
{{ random 'Address.zipCode' }}
{{ random 'Address.postcode' }}
{{ random 'Address.stateAbbr' }}
{{ random 'Address.citySuffix' }}
{{ random 'Address.cityPrefix' }}
{{ random 'Address.city' }}
{{ random 'Address.cityName' }}
{{ random 'Address.latitude' }}
{{ random 'Address.longitude' }}
{{ random 'Address.latLon' }}
{{ random 'Address.lonLat' }}
{{ random 'Address.timeZone' }}
{{ random 'Address.mailBox' }}
{{ random 'Address.streetAddressNumber' }}
{{ random 'Address.streetAddress' }}
{{ random 'Address.secondaryAddress' }}
{{ random 'Address.zipCodePlus4' }}
{{ random 'Address.streetSuffix' }}
{{ random 'Address.streetPrefix' }}
{{ random 'Address.countryCode' }}
{{ random 'Address.buildingNumber' }}
{{ random 'Address.fullAddress' }}
```


#### Key - Ancient

```handlebars
{{ random 'Ancient.god' }}
{{ random 'Ancient.primordial' }}
{{ random 'Ancient.titan' }}
{{ random 'Ancient.hero' }}
```


#### Key - Animal

```handlebars
{{ random 'Animal.name' }}
{{ random 'Animal.species' }}
{{ random 'Animal.genus' }}
{{ random 'Animal.scientificName' }}
```


#### Key - App

```handlebars
{{ random 'App.name' }}
{{ random 'App.version' }}
{{ random 'App.author' }}
```


#### Key - Appliance

```handlebars
{{ random 'Appliance.brand' }}
{{ random 'Appliance.equipment' }}
```


#### Key - Artist

```handlebars
{{ random 'Artist.name' }}
```


#### Key - Australia

```handlebars
{{ random 'Australia.locations' }}
{{ random 'Australia.animals' }}
{{ random 'Australia.states' }}
```


#### Key - Aviation

```handlebars
{{ random 'Aviation.aircraft' }}
{{ random 'Aviation.airport' }}
{{ random 'Aviation.METAR' }}
{{ random 'Aviation.flight' }}
{{ random 'Aviation.airline' }}
```


#### Key - Aws

```handlebars
{{ random 'Aws.region' }}
{{ random 'Aws.accountId' }}
{{ random 'Aws.acmARN' }}
{{ random 'Aws.albARN' }}
{{ random 'Aws.subnetId' }}
{{ random 'Aws.vpcId' }}
{{ random 'Aws.albTargetGroupARN' }}
{{ random 'Aws.route53ZoneId' }}
{{ random 'Aws.securityGroupId' }}
```


#### Key - Azure

```handlebars
{{ random 'Azure.region' }}
{{ random 'Azure.tenantId' }}
{{ random 'Azure.firewall' }}
{{ random 'Azure.virtualWan' }}
{{ random 'Azure.serviceBus' }}
{{ random 'Azure.keyVault' }}
{{ random 'Azure.subscriptionId' }}
{{ random 'Azure.resourceGroup' }}
{{ random 'Azure.managementGroup' }}
{{ random 'Azure.applicationGateway' }}
{{ random 'Azure.bastionHost' }}
{{ random 'Azure.loadBalancer' }}
{{ random 'Azure.networkSecurityGroup' }}
{{ random 'Azure.virtualNetwork' }}
{{ random 'Azure.appServiceEnvironment' }}
{{ random 'Azure.appServicePlan' }}
{{ random 'Azure.loadTesting' }}
{{ random 'Azure.staticWebApp' }}
{{ random 'Azure.virtualMachine' }}
{{ random 'Azure.storageAccount' }}
{{ random 'Azure.containerRegistry' }}
{{ random 'Azure.containerApps' }}
{{ random 'Azure.containerAppsEnvironment' }}
{{ random 'Azure.containerInstance' }}
{{ random 'Azure.cosmosDBDatabase' }}
{{ random 'Azure.sqlDatabase' }}
{{ random 'Azure.mysqlDatabase' }}
{{ random 'Azure.postgreSQLDatabase' }}
{{ random 'Azure.serviceBusQueue' }}
{{ random 'Azure.serviceBusTopic' }}
{{ random 'Azure.logAnalytics' }}
```


#### Key - Barcode

```handlebars
{{ random 'Barcode.type' }}
{{ random 'Barcode.ean8' }}
{{ random 'Barcode.gtin8' }}
{{ random 'Barcode.gtin13' }}
{{ random 'Barcode.ean13' }}
{{ random 'Barcode.gtin14' }}
{{ random 'Barcode.gtin12' }}
```


#### Key - BloodType

```handlebars
{{ random 'BloodType.aboTypes' }}
{{ random 'BloodType.rhTypes' }}
{{ random 'BloodType.pTypes' }}
{{ random 'BloodType.bloodGroup' }}
```


#### Key - Book

```handlebars
{{ random 'Book.title' }}
{{ random 'Book.author' }}
{{ random 'Book.publisher' }}
{{ random 'Book.genre' }}
```


#### Key - Bool

```handlebars
{{ random 'Bool.bool' }}
```


#### Key - Business

```handlebars
{{ random 'Business.creditCardNumber' }}
{{ random 'Business.creditCardType' }}
{{ random 'Business.creditCardExpiry' }}
{{ random 'Business.securityCode' }}
```


#### Key - CNPJ

```handlebars
{{ random 'CNPJ.valid' }}
{{ random 'CNPJ.invalid' }}
```


#### Key - CPF

```handlebars
{{ random 'CPF.valid' }}
{{ random 'CPF.invalid' }}
```


#### Key - Camera

```handlebars
{{ random 'Camera.brand' }}
{{ random 'Camera.model' }}
{{ random 'Camera.brandWithModel' }}
```


#### Key - Cannabis

```handlebars
{{ random 'Cannabis.types' }}
{{ random 'Cannabis.strains' }}
{{ random 'Cannabis.terpenes' }}
{{ random 'Cannabis.categories' }}
{{ random 'Cannabis.buzzwords' }}
{{ random 'Cannabis.brands' }}
{{ random 'Cannabis.cannabinoidAbbreviations' }}
{{ random 'Cannabis.cannabinoids' }}
{{ random 'Cannabis.medicalUses' }}
{{ random 'Cannabis.healthBenefits' }}
```


#### Key - Cat

```handlebars
{{ random 'Cat.name' }}
{{ random 'Cat.breed' }}
{{ random 'Cat.registry' }}
```


#### Key - Chiquito

```handlebars
{{ random 'Chiquito.terms' }}
{{ random 'Chiquito.sentences' }}
{{ random 'Chiquito.jokes' }}
{{ random 'Chiquito.expressions' }}
```


#### Key - Code

```handlebars
{{ random 'Code.asin' }}
{{ random 'Code.isbnGs1' }}
{{ random 'Code.isbnGroup' }}
{{ random 'Code.isbn10' }}
{{ random 'Code.isbn13' }}
{{ random 'Code.imei' }}
{{ random 'Code.ean8' }}
{{ random 'Code.gtin8' }}
{{ random 'Code.gtin13' }}
{{ random 'Code.ean13' }}
{{ random 'Code.isbnRegistrant' }}
```


#### Key - Coin

```handlebars
{{ random 'Coin.flip' }}
```


#### Key - Color

```handlebars
{{ random 'Color.name' }}
{{ random 'Color.hex' }}
```


#### Key - Commerce

```handlebars
{{ random 'Commerce.brand' }}
{{ random 'Commerce.department' }}
{{ random 'Commerce.material' }}
{{ random 'Commerce.vendor' }}
{{ random 'Commerce.price' }}
{{ random 'Commerce.productName' }}
{{ random 'Commerce.promotionCode' }}
```


#### Key - Community

```handlebars
{{ random 'Community.quote' }}
{{ random 'Community.character' }}
```


#### Key - Company

```handlebars
{{ random 'Company.name' }}
{{ random 'Company.bs' }}
{{ random 'Company.suffix' }}
{{ random 'Company.url' }}
{{ random 'Company.industry' }}
{{ random 'Company.profession' }}
{{ random 'Company.buzzword' }}
{{ random 'Company.logo' }}
{{ random 'Company.catchPhrase' }}
```


#### Key - Compass

```handlebars
{{ random 'Compass.word' }}
{{ random 'Compass.azimuth' }}
{{ random 'Compass.abbreviation' }}
```


#### Key - Computer

```handlebars
{{ random 'Computer.type' }}
{{ random 'Computer.platform' }}
{{ random 'Computer.linux' }}
{{ random 'Computer.macos' }}
{{ random 'Computer.windows' }}
{{ random 'Computer.operatingSystem' }}
```


#### Key - Construction

```handlebars
{{ random 'Construction.materials' }}
{{ random 'Construction.roles' }}
{{ random 'Construction.trades' }}
{{ random 'Construction.heavyEquipment' }}
{{ random 'Construction.subcontractCategories' }}
{{ random 'Construction.standardCostCodes' }}
```


#### Key - Cosmere

```handlebars
{{ random 'Cosmere.aons' }}
{{ random 'Cosmere.shards' }}
{{ random 'Cosmere.surges' }}
{{ random 'Cosmere.metals' }}
{{ random 'Cosmere.heralds' }}
{{ random 'Cosmere.sprens' }}
{{ random 'Cosmere.shardWorlds' }}
{{ random 'Cosmere.knightsRadiant' }}
{{ random 'Cosmere.allomancers' }}
{{ random 'Cosmere.feruchemists' }}
```


#### Key - Country

```handlebars
{{ random 'Country.name' }}
{{ random 'Country.flag' }}
{{ random 'Country.currency' }}
{{ random 'Country.currencyCode' }}
{{ random 'Country.capital' }}
{{ random 'Country.countryCode2' }}
{{ random 'Country.countryCode3' }}
```


#### Key - CryptoCoin

```handlebars
{{ random 'CryptoCoin.coin' }}
```


#### Key - CultureSeries

```handlebars
{{ random 'CultureSeries.books' }}
{{ random 'CultureSeries.civs' }}
{{ random 'CultureSeries.planets' }}
{{ random 'CultureSeries.cultureShips' }}
{{ random 'CultureSeries.cultureShipClasses' }}
{{ random 'CultureSeries.cultureShipClassAbvs' }}
```


#### Key - Currency

```handlebars
{{ random 'Currency.name' }}
{{ random 'Currency.code' }}
```


#### Key - DcComics

```handlebars
{{ random 'DcComics.name' }}
{{ random 'DcComics.hero' }}
{{ random 'DcComics.heroine' }}
{{ random 'DcComics.villain' }}
{{ random 'DcComics.title' }}
```


#### Key - Demographic

```handlebars
{{ random 'Demographic.race' }}
{{ random 'Demographic.demonym' }}
{{ random 'Demographic.sex' }}
{{ random 'Demographic.educationalAttainment' }}
{{ random 'Demographic.maritalStatus' }}
```


#### Key - Device

```handlebars
{{ random 'Device.platform' }}
{{ random 'Device.modelName' }}
{{ random 'Device.serial' }}
{{ random 'Device.manufacturer' }}
```


#### Key - Disease

```handlebars
{{ random 'Disease.ophthalmologyAndOtorhinolaryngology' }}
{{ random 'Disease.neurology' }}
{{ random 'Disease.surgery' }}
{{ random 'Disease.internalDisease' }}
{{ random 'Disease.paediatrics' }}
{{ random 'Disease.gynecologyAndObstetrics' }}
{{ random 'Disease.dermatolory' }}
```


#### Key - Dog

```handlebars
{{ random 'Dog.name' }}
{{ random 'Dog.size' }}
{{ random 'Dog.breed' }}
{{ random 'Dog.sound' }}
{{ random 'Dog.memePhrase' }}
{{ random 'Dog.age' }}
{{ random 'Dog.coatLength' }}
{{ random 'Dog.gender' }}
```


#### Key - Drone

```handlebars
{{ random 'Drone.name' }}
{{ random 'Drone.iso' }}
{{ random 'Drone.weight' }}
{{ random 'Drone.flightTime' }}
{{ random 'Drone.maxSpeed' }}
{{ random 'Drone.maxAscentSpeed' }}
{{ random 'Drone.maxDescentSpeed' }}
{{ random 'Drone.maxAltitude' }}
{{ random 'Drone.maxFlightDistance' }}
{{ random 'Drone.maxWindResistance' }}
{{ random 'Drone.maxAngularVelocity' }}
{{ random 'Drone.maxTiltAngle' }}
{{ random 'Drone.operatingTemperature' }}
{{ random 'Drone.batteryCapacity' }}
{{ random 'Drone.batteryVoltage' }}
{{ random 'Drone.batteryType' }}
{{ random 'Drone.batteryWeight' }}
{{ random 'Drone.chargingTemperature' }}
{{ random 'Drone.maxChargingPower' }}
{{ random 'Drone.maxResolution' }}
{{ random 'Drone.photoFormat' }}
{{ random 'Drone.videoFormat' }}
{{ random 'Drone.maxShutterSpeed' }}
{{ random 'Drone.minShutterSpeed' }}
{{ random 'Drone.shutterSpeedUnits' }}
```


#### Key - DungeonsAndDragons

```handlebars
{{ random 'DungeonsAndDragons.alignments' }}
{{ random 'DungeonsAndDragons.cities' }}
{{ random 'DungeonsAndDragons.klasses' }}
{{ random 'DungeonsAndDragons.languages' }}
{{ random 'DungeonsAndDragons.monsters' }}
{{ random 'DungeonsAndDragons.races' }}
{{ random 'DungeonsAndDragons.backgrounds' }}
{{ random 'DungeonsAndDragons.meleeWeapons' }}
{{ random 'DungeonsAndDragons.rangedWeapons' }}
```


#### Key - Educator

```handlebars
{{ random 'Educator.course' }}
{{ random 'Educator.campus' }}
{{ random 'Educator.university' }}
{{ random 'Educator.subjectWithNumber' }}
{{ random 'Educator.secondarySchool' }}
```


#### Key - EldenRing

```handlebars
{{ random 'EldenRing.location' }}
{{ random 'EldenRing.weapon' }}
{{ random 'EldenRing.skill' }}
{{ random 'EldenRing.spell' }}
{{ random 'EldenRing.npc' }}
```


#### Key - ElectricalComponents

```handlebars
{{ random 'ElectricalComponents.active' }}
{{ random 'ElectricalComponents.passive' }}
{{ random 'ElectricalComponents.electromechanical' }}
```


#### Key - Emoji

```handlebars
{{ random 'Emoji.cat' }}
{{ random 'Emoji.smiley' }}
```


#### Key - FamousLastWords

```handlebars
{{ random 'FamousLastWords.lastWords' }}
```


#### Key - File

```handlebars
{{ random 'File.fileName' }}
{{ random 'File.extension' }}
{{ random 'File.mimeType' }}
```


#### Key - Finance

```handlebars
{{ random 'Finance.nyseTicker' }}
{{ random 'Finance.creditCard' }}
{{ random 'Finance.bic' }}
{{ random 'Finance.iban' }}
{{ random 'Finance.nasdaqTicker' }}
{{ random 'Finance.stockMarket' }}
```


#### Key - FreshPrinceOfBelAir

```handlebars
{{ random 'FreshPrinceOfBelAir.characters' }}
{{ random 'FreshPrinceOfBelAir.quotes' }}
{{ random 'FreshPrinceOfBelAir.celebrities' }}
```


#### Key - FunnyName

```handlebars
{{ random 'FunnyName.name' }}
```


#### Key - GarmentSize

```handlebars
{{ random 'GarmentSize.size' }}
```


#### Key - Gender

```handlebars
{{ random 'Gender.types' }}
{{ random 'Gender.binaryTypes' }}
{{ random 'Gender.shortBinaryTypes' }}
```


#### Key - GratefulDead

```handlebars
{{ random 'GratefulDead.players' }}
{{ random 'GratefulDead.songs' }}
```


#### Key - GreekPhilosopher

```handlebars
{{ random 'GreekPhilosopher.name' }}
{{ random 'GreekPhilosopher.quote' }}
```


#### Key - Hacker

```handlebars
{{ random 'Hacker.noun' }}
{{ random 'Hacker.ingverb' }}
{{ random 'Hacker.adjective' }}
{{ random 'Hacker.verb' }}
{{ random 'Hacker.abbreviation' }}
```


#### Key - Hashing

```handlebars
{{ random 'Hashing.md2' }}
{{ random 'Hashing.md5' }}
{{ random 'Hashing.sha1' }}
{{ random 'Hashing.sha384' }}
{{ random 'Hashing.sha256' }}
{{ random 'Hashing.sha512' }}
```


#### Key - Hipster

```handlebars
{{ random 'Hipster.word' }}
```


#### Key - Hobby

```handlebars
{{ random 'Hobby.activity' }}
```


#### Key - Hololive

```handlebars
{{ random 'Hololive.talent' }}
```


#### Key - Horse

```handlebars
{{ random 'Horse.name' }}
{{ random 'Horse.breed' }}
```


#### Key - House

```handlebars
{{ random 'House.room' }}
{{ random 'House.furniture' }}
```


#### Key - IdNumber

```handlebars
{{ random 'IdNumber.valid' }}
{{ random 'IdNumber.invalid' }}
{{ random 'IdNumber.ssnValid' }}
{{ random 'IdNumber.validPtNif' }}
{{ random 'IdNumber.validSvSeSsn' }}
{{ random 'IdNumber.validEnZaSsn' }}
{{ random 'IdNumber.inValidEnZaSsn' }}
{{ random 'IdNumber.invalidSvSeSsn' }}
{{ random 'IdNumber.singaporeanFin' }}
{{ random 'IdNumber.singaporeanFinBefore2000' }}
{{ random 'IdNumber.singaporeanUin' }}
{{ random 'IdNumber.singaporeanUinBefore2000' }}
{{ random 'IdNumber.validZhCNSsn' }}
{{ random 'IdNumber.invalidPtNif' }}
{{ random 'IdNumber.validEsMXSsn' }}
{{ random 'IdNumber.invalidEsMXSsn' }}
{{ random 'IdNumber.peselNumber' }}
```


#### Key - IndustrySegments

```handlebars
{{ random 'IndustrySegments.industry' }}
{{ random 'IndustrySegments.sector' }}
{{ random 'IndustrySegments.subSector' }}
{{ random 'IndustrySegments.superSector' }}
```


#### Key - Internet

```handlebars
{{ random 'Internet.url' }}
{{ random 'Internet.port' }}
{{ random 'Internet.image' }}
{{ random 'Internet.domainWord' }}
{{ random 'Internet.httpMethod' }}
{{ random 'Internet.macAddress' }}
{{ random 'Internet.ipV4Cidr' }}
{{ random 'Internet.ipV6Cidr' }}
{{ random 'Internet.uuidv3' }}
{{ random 'Internet.userAgent' }}
{{ random 'Internet.slug' }}
{{ random 'Internet.uuid' }}
{{ random 'Internet.domainName' }}
{{ random 'Internet.password' }}
{{ random 'Internet.emailAddress' }}
{{ random 'Internet.safeEmailAddress' }}
{{ random 'Internet.ipV4Address' }}
{{ random 'Internet.getIpV4Address' }}
{{ random 'Internet.privateIpV4Address' }}
{{ random 'Internet.getPrivateIpV4Address' }}
{{ random 'Internet.publicIpV4Address' }}
{{ random 'Internet.getPublicIpV4Address' }}
{{ random 'Internet.ipV6Address' }}
{{ random 'Internet.getIpV6Address' }}
{{ random 'Internet.botUserAgentAny' }}
{{ random 'Internet.domainSuffix' }}
```


#### Key - Job

```handlebars
{{ random 'Job.position' }}
{{ random 'Job.field' }}
{{ random 'Job.seniority' }}
{{ random 'Job.keySkills' }}
{{ random 'Job.title' }}
```


#### Key - Kpop

```handlebars
{{ random 'Kpop.iGroups' }}
{{ random 'Kpop.iiGroups' }}
{{ random 'Kpop.iiiGroups' }}
{{ random 'Kpop.girlGroups' }}
{{ random 'Kpop.boyBands' }}
{{ random 'Kpop.solo' }}
```


#### Key - Lorem

```handlebars
{{ random 'Lorem.words' }}
{{ random 'Lorem.word' }}
{{ random 'Lorem.character' }}
{{ random 'Lorem.sentence' }}
{{ random 'Lorem.paragraph' }}
{{ random 'Lorem.characters' }}
```


#### Key - Marketing

```handlebars
{{ random 'Marketing.buzzwords' }}
```


#### Key - Matz

```handlebars
{{ random 'Matz.quote' }}
```


#### Key - Mbti

```handlebars
{{ random 'Mbti.name' }}
{{ random 'Mbti.type' }}
{{ random 'Mbti.personage' }}
{{ random 'Mbti.merit' }}
{{ random 'Mbti.weakness' }}
{{ random 'Mbti.characteristic' }}
```


#### Key - Measurement

```handlebars
{{ random 'Measurement.length' }}
{{ random 'Measurement.height' }}
{{ random 'Measurement.weight' }}
{{ random 'Measurement.volume' }}
{{ random 'Measurement.metricHeight' }}
{{ random 'Measurement.metricLength' }}
{{ random 'Measurement.metricVolume' }}
{{ random 'Measurement.metricWeight' }}
```


#### Key - Medical

```handlebars
{{ random 'Medical.symptoms' }}
{{ random 'Medical.medicineName' }}
{{ random 'Medical.diseaseName' }}
{{ random 'Medical.hospitalName' }}
{{ random 'Medical.diagnosisCode' }}
{{ random 'Medical.procedureCode' }}
```


#### Key - Military

```handlebars
{{ random 'Military.armyRank' }}
{{ random 'Military.navyRank' }}
{{ random 'Military.marinesRank' }}
{{ random 'Military.airForceRank' }}
{{ random 'Military.dodPaygrade' }}
```


#### Key - Money

```handlebars
{{ random 'Money.currency' }}
{{ random 'Money.currencyCode' }}
```


#### Key - Mood

```handlebars
{{ random 'Mood.feeling' }}
{{ random 'Mood.emotion' }}
{{ random 'Mood.tone' }}
```


#### Key - Mountain

```handlebars
{{ random 'Mountain.name' }}
{{ random 'Mountain.range' }}
```


#### Key - Mountaineering

```handlebars
{{ random 'Mountaineering.mountaineer' }}
```


#### Key - Music

```handlebars
{{ random 'Music.key' }}
{{ random 'Music.instrument' }}
{{ random 'Music.chord' }}
{{ random 'Music.genre' }}
```


#### Key - Name

```handlebars
{{ random 'Name.name' }}
{{ random 'Name.prefix' }}
{{ random 'Name.suffix' }}
{{ random 'Name.lastName' }}
{{ random 'Name.fullName' }}
{{ random 'Name.firstName' }}
{{ random 'Name.title' }}
{{ random 'Name.username' }}
{{ random 'Name.nameWithMiddle' }}
```


#### Key - Nation

```handlebars
{{ random 'Nation.flag' }}
{{ random 'Nation.language' }}
{{ random 'Nation.isoCountry' }}
{{ random 'Nation.nationality' }}
{{ random 'Nation.capitalCity' }}
{{ random 'Nation.isoLanguage' }}
```


#### Key - NatoPhoneticAlphabet

```handlebars
{{ random 'NatoPhoneticAlphabet.codeWord' }}
```


#### Key - Nigeria

```handlebars
{{ random 'Nigeria.name' }}
{{ random 'Nigeria.places' }}
{{ random 'Nigeria.schools' }}
{{ random 'Nigeria.food' }}
{{ random 'Nigeria.celebrities' }}
```


#### Key - Number

```handlebars
{{ random 'Number.digit' }}
{{ random 'Number.negative' }}
{{ random 'Number.positive' }}
{{ random 'Number.randomDigit' }}
{{ random 'Number.randomDigitNotZero' }}
{{ random 'Number.randomNumber' }}
```

#### Key - Passport

```handlebars
{{ random 'Passport.valid' }}
```


#### Key - PhoneNumber

```handlebars
{{ random 'PhoneNumber.extension' }}
{{ random 'PhoneNumber.cellPhone' }}
{{ random 'PhoneNumber.phoneNumberInternational' }}
{{ random 'PhoneNumber.phoneNumberNational' }}
{{ random 'PhoneNumber.subscriberNumber' }}
{{ random 'PhoneNumber.phoneNumber' }}
```


#### Key - Photography

```handlebars
{{ random 'Photography.iso' }}
{{ random 'Photography.brand' }}
{{ random 'Photography.genre' }}
{{ random 'Photography.lens' }}
{{ random 'Photography.imageTag' }}
{{ random 'Photography.aperture' }}
{{ random 'Photography.shutter' }}
{{ random 'Photography.camera' }}
{{ random 'Photography.term' }}
```


#### Key - ProgrammingLanguage

```handlebars
{{ random 'ProgrammingLanguage.name' }}
{{ random 'ProgrammingLanguage.creator' }}
```


#### Key - Relationship

```handlebars
{{ random 'Relationship.parent' }}
{{ random 'Relationship.inLaw' }}
{{ random 'Relationship.spouse' }}
{{ random 'Relationship.sibling' }}
```


#### Key - Restaurant

```handlebars
{{ random 'Restaurant.name' }}
{{ random 'Restaurant.type' }}
{{ random 'Restaurant.description' }}
{{ random 'Restaurant.namePrefix' }}
{{ random 'Restaurant.nameSuffix' }}
{{ random 'Restaurant.review' }}
```


#### Key - Robin

```handlebars
{{ random 'Robin.quote' }}
```


#### Key - RockBand

```handlebars
{{ random 'RockBand.name' }}
```


#### Key - Science

```handlebars
{{ random 'Science.element' }}
{{ random 'Science.unit' }}
{{ random 'Science.scientist' }}
{{ random 'Science.tool' }}
{{ random 'Science.quark' }}
{{ random 'Science.leptons' }}
{{ random 'Science.bosons' }}
{{ random 'Science.elementSymbol' }}
```


#### Key - Shakespeare

```handlebars
{{ random 'Shakespeare.hamletQuote' }}
{{ random 'Shakespeare.asYouLikeItQuote' }}
{{ random 'Shakespeare.kingRichardIIIQuote' }}
{{ random 'Shakespeare.romeoAndJulietQuote' }}
```


#### Key - Sip

```handlebars
{{ random 'Sip.method' }}
{{ random 'Sip.rtpPort' }}
{{ random 'Sip.bodyString' }}
{{ random 'Sip.bodyBytes' }}
{{ random 'Sip.contentType' }}
{{ random 'Sip.messagingPort' }}
{{ random 'Sip.provisionalResponseCode' }}
{{ random 'Sip.successResponseCode' }}
{{ random 'Sip.redirectResponseCode' }}
{{ random 'Sip.clientErrorResponseCode' }}
{{ random 'Sip.serverErrorResponseCode' }}
{{ random 'Sip.globalErrorResponseCode' }}
{{ random 'Sip.provisionalResponsePhrase' }}
{{ random 'Sip.successResponsePhrase' }}
{{ random 'Sip.redirectResponsePhrase' }}
{{ random 'Sip.clientErrorResponsePhrase' }}
{{ random 'Sip.serverErrorResponsePhrase' }}
{{ random 'Sip.globalErrorResponsePhrase' }}
{{ random 'Sip.nameAddress' }}
```


#### Key - Size

```handlebars
{{ random 'Size.adjective' }}
```


#### Key - SlackEmoji

```handlebars
{{ random 'SlackEmoji.people' }}
{{ random 'SlackEmoji.nature' }}
{{ random 'SlackEmoji.custom' }}
{{ random 'SlackEmoji.activity' }}
{{ random 'SlackEmoji.emoji' }}
{{ random 'SlackEmoji.foodAndDrink' }}
{{ random 'SlackEmoji.celebration' }}
{{ random 'SlackEmoji.travelAndPlaces' }}
{{ random 'SlackEmoji.objectsAndSymbols' }}
```


#### Key - Space

```handlebars
{{ random 'Space.planet' }}
{{ random 'Space.moon' }}
{{ random 'Space.galaxy' }}
{{ random 'Space.nebula' }}
{{ random 'Space.star' }}
{{ random 'Space.agency' }}
{{ random 'Space.meteorite' }}
{{ random 'Space.company' }}
{{ random 'Space.starCluster' }}
{{ random 'Space.constellation' }}
{{ random 'Space.agencyAbbreviation' }}
{{ random 'Space.nasaSpaceCraft' }}
{{ random 'Space.distanceMeasurement' }}
```


#### Key - Stock

```handlebars
{{ random 'Stock.nsdqSymbol' }}
{{ random 'Stock.nyseSymbol' }}
```


#### Key - Subscription

```handlebars
{{ random 'Subscription.plans' }}
{{ random 'Subscription.statuses' }}
{{ random 'Subscription.paymentMethods' }}
{{ random 'Subscription.subscriptionTerms' }}
{{ random 'Subscription.paymentTerms' }}
```


#### Key - Superhero

```handlebars
{{ random 'Superhero.name' }}
{{ random 'Superhero.prefix' }}
{{ random 'Superhero.suffix' }}
{{ random 'Superhero.descriptor' }}
{{ random 'Superhero.power' }}
```


#### Key - Team

```handlebars
{{ random 'Team.name' }}
{{ random 'Team.state' }}
{{ random 'Team.sport' }}
{{ random 'Team.creature' }}
```


#### Key - Text

```handlebars
{{ random 'Text.text' }}
{{ random 'Text.character' }}
{{ random 'Text.uppercaseCharacter' }}
{{ random 'Text.lowercaseCharacter' }}
```


#### Key - Tron

```handlebars
{{ random 'Tron.location' }}
{{ random 'Tron.quote' }}
{{ random 'Tron.character' }}
{{ random 'Tron.game' }}
{{ random 'Tron.tagline' }}
{{ random 'Tron.vehicle' }}
{{ random 'Tron.alternateCharacterSpelling' }}
```


#### Key - Twitter

```handlebars
{{ random 'Twitter.userName' }}
{{ random 'Twitter.userId' }}
```


#### Key - University

```handlebars
{{ random 'University.name' }}
{{ random 'University.prefix' }}
{{ random 'University.suffix' }}
```


#### Key - Vehicle

```handlebars
{{ random 'Vehicle.make' }}
{{ random 'Vehicle.color' }}
{{ random 'Vehicle.style' }}
{{ random 'Vehicle.vin' }}
{{ random 'Vehicle.upholstery' }}
{{ random 'Vehicle.driveType' }}
{{ random 'Vehicle.fuelType' }}
{{ random 'Vehicle.carType' }}
{{ random 'Vehicle.engine' }}
{{ random 'Vehicle.carOptions' }}
{{ random 'Vehicle.doors' }}
{{ random 'Vehicle.model' }}
{{ random 'Vehicle.manufacturer' }}
{{ random 'Vehicle.makeAndModel' }}
{{ random 'Vehicle.upholsteryColor' }}
{{ random 'Vehicle.upholsteryFabric' }}
{{ random 'Vehicle.transmission' }}
{{ random 'Vehicle.standardSpecs' }}
{{ random 'Vehicle.licensePlate' }}
```


#### Key - Verb

```handlebars
{{ random 'Verb.base' }}
{{ random 'Verb.ingForm' }}
{{ random 'Verb.past' }}
{{ random 'Verb.pastParticiple' }}
{{ random 'Verb.simplePresent' }}
```


#### Key - Weather

```handlebars
{{ random 'Weather.description' }}
{{ random 'Weather.temperatureCelsius' }}
{{ random 'Weather.temperatureFahrenheit' }}
```


#### Key - Yoda

```handlebars
{{ random 'Yoda.quote' }}
```


### Category - Food

#### Key - Beer

```handlebars
{{ random 'Beer.name' }}
{{ random 'Beer.style' }}
{{ random 'Beer.hop' }}
{{ random 'Beer.yeast' }}
{{ random 'Beer.malt' }}
```


#### Key - Coffee

```handlebars
{{ random 'Coffee.descriptor' }}
{{ random 'Coffee.name1' }}
{{ random 'Coffee.name2' }}
{{ random 'Coffee.body' }}
{{ random 'Coffee.country' }}
{{ random 'Coffee.region' }}
{{ random 'Coffee.variety' }}
{{ random 'Coffee.notes' }}
{{ random 'Coffee.blendName' }}
{{ random 'Coffee.intensifier' }}
```


#### Key - Dessert

```handlebars
{{ random 'Dessert.variety' }}
{{ random 'Dessert.topping' }}
{{ random 'Dessert.flavor' }}
```


#### Key - Food

```handlebars
{{ random 'Food.ingredient' }}
{{ random 'Food.spice' }}
{{ random 'Food.dish' }}
{{ random 'Food.fruit' }}
{{ random 'Food.vegetable' }}
{{ random 'Food.sushi' }}
{{ random 'Food.measurement' }}
```


#### Key - Tea

```handlebars
{{ random 'Tea.type' }}
{{ random 'Tea.variety' }}
```


### Category - Movie

#### Key - AquaTeenHungerForce

```handlebars
{{ random 'AquaTeenHungerForce.character' }}
```


#### Key - Avatar

```handlebars
{{ random 'Avatar.image' }}
```


#### Key - Babylon5

```handlebars
{{ random 'Babylon5.quote' }}
{{ random 'Babylon5.character' }}
```


#### Key - BackToTheFuture

```handlebars
{{ random 'BackToTheFuture.quote' }}
{{ random 'BackToTheFuture.date' }}
{{ random 'BackToTheFuture.character' }}
```


#### Key - BigBangTheory

```handlebars
{{ random 'BigBangTheory.quote' }}
{{ random 'BigBangTheory.character' }}
```


#### Key - BojackHorseman

```handlebars
{{ random 'BojackHorseman.characters' }}
{{ random 'BojackHorseman.quotes' }}
{{ random 'BojackHorseman.tongueTwisters' }}
```


#### Key - BossaNova

```handlebars
{{ random 'BossaNova.artist' }}
{{ random 'BossaNova.song' }}
```


#### Key - BreakingBad

```handlebars
{{ random 'BreakingBad.character' }}
{{ random 'BreakingBad.episode' }}
```


#### Key - BrooklynNineNine

```handlebars
{{ random 'BrooklynNineNine.characters' }}
{{ random 'BrooklynNineNine.quotes' }}
```


#### Key - Buffy

```handlebars
{{ random 'Buffy.characters' }}
{{ random 'Buffy.quotes' }}
{{ random 'Buffy.bigBads' }}
{{ random 'Buffy.episodes' }}
{{ random 'Buffy.celebrities' }}
```


#### Key - ChuckNorris

```handlebars
{{ random 'ChuckNorris.fact' }}
```


#### Key - DarkSoul

```handlebars
{{ random 'DarkSoul.classes' }}
{{ random 'DarkSoul.stats' }}
{{ random 'DarkSoul.covenants' }}
{{ random 'DarkSoul.shield' }}
```


#### Key - Departed

```handlebars
{{ random 'Departed.quote' }}
{{ random 'Departed.character' }}
{{ random 'Departed.actor' }}
```


#### Key - DetectiveConan

```handlebars
{{ random 'DetectiveConan.characters' }}
{{ random 'DetectiveConan.gadgets' }}
{{ random 'DetectiveConan.vehicles' }}
```


#### Key - DoctorWho

```handlebars
{{ random 'DoctorWho.quote' }}
{{ random 'DoctorWho.character' }}
{{ random 'DoctorWho.species' }}
{{ random 'DoctorWho.actor' }}
{{ random 'DoctorWho.villain' }}
{{ random 'DoctorWho.doctor' }}
{{ random 'DoctorWho.catchPhrase' }}
```


#### Key - Doraemon

```handlebars
{{ random 'Doraemon.location' }}
{{ random 'Doraemon.character' }}
{{ random 'Doraemon.gadget' }}
```


#### Key - DragonBall

```handlebars
{{ random 'DragonBall.character' }}
```


#### Key - DumbAndDumber

```handlebars
{{ random 'DumbAndDumber.quote' }}
{{ random 'DumbAndDumber.character' }}
{{ random 'DumbAndDumber.actor' }}
```


#### Key - Dune

```handlebars
{{ random 'Dune.quote' }}
{{ random 'Dune.character' }}
{{ random 'Dune.title' }}
{{ random 'Dune.planet' }}
{{ random 'Dune.saying' }}
```


#### Key - FamilyGuy

```handlebars
{{ random 'FamilyGuy.location' }}
{{ random 'FamilyGuy.quote' }}
{{ random 'FamilyGuy.character' }}
```


#### Key - FinalSpace

```handlebars
{{ random 'FinalSpace.quote' }}
{{ random 'FinalSpace.character' }}
{{ random 'FinalSpace.vehicle' }}
```


#### Key - Friends

```handlebars
{{ random 'Friends.location' }}
{{ random 'Friends.quote' }}
{{ random 'Friends.character' }}
```


#### Key - FullmetalAlchemist

```handlebars
{{ random 'FullmetalAlchemist.country' }}
{{ random 'FullmetalAlchemist.character' }}
{{ random 'FullmetalAlchemist.city' }}
```


#### Key - GameOfThrones

```handlebars
{{ random 'GameOfThrones.quote' }}
{{ random 'GameOfThrones.character' }}
{{ random 'GameOfThrones.city' }}
{{ random 'GameOfThrones.house' }}
{{ random 'GameOfThrones.dragon' }}
```


#### Key - Ghostbusters

```handlebars
{{ random 'Ghostbusters.quote' }}
{{ random 'Ghostbusters.character' }}
{{ random 'Ghostbusters.actor' }}
```


#### Key - HarryPotter

```handlebars
{{ random 'HarryPotter.location' }}
{{ random 'HarryPotter.quote' }}
{{ random 'HarryPotter.character' }}
{{ random 'HarryPotter.spell' }}
{{ random 'HarryPotter.book' }}
{{ random 'HarryPotter.house' }}
```


#### Key - HeyArnold

```handlebars
{{ random 'HeyArnold.locations' }}
{{ random 'HeyArnold.characters' }}
{{ random 'HeyArnold.quotes' }}
```


#### Key - HitchhikersGuideToTheGalaxy

```handlebars
{{ random 'HitchhikersGuideToTheGalaxy.location' }}
{{ random 'HitchhikersGuideToTheGalaxy.quote' }}
{{ random 'HitchhikersGuideToTheGalaxy.character' }}
{{ random 'HitchhikersGuideToTheGalaxy.species' }}
{{ random 'HitchhikersGuideToTheGalaxy.planet' }}
{{ random 'HitchhikersGuideToTheGalaxy.starship' }}
{{ random 'HitchhikersGuideToTheGalaxy.marvinQuote' }}
```


#### Key - Hobbit

```handlebars
{{ random 'Hobbit.location' }}
{{ random 'Hobbit.quote' }}
{{ random 'Hobbit.character' }}
{{ random 'Hobbit.thorinsCompany' }}
```


#### Key - HowIMetYourMother

```handlebars
{{ random 'HowIMetYourMother.quote' }}
{{ random 'HowIMetYourMother.character' }}
{{ random 'HowIMetYourMother.highFive' }}
{{ random 'HowIMetYourMother.catchPhrase' }}
```


#### Key - Kaamelott

```handlebars
{{ random 'Kaamelott.quote' }}
{{ random 'Kaamelott.character' }}
```


#### Key - Lebowski

```handlebars
{{ random 'Lebowski.quote' }}
{{ random 'Lebowski.character' }}
{{ random 'Lebowski.actor' }}
```


#### Key - LordOfTheRings

```handlebars
{{ random 'LordOfTheRings.location' }}
{{ random 'LordOfTheRings.character' }}
```


#### Key - MoneyHeist

```handlebars
{{ random 'MoneyHeist.quote' }}
{{ random 'MoneyHeist.character' }}
{{ random 'MoneyHeist.heist' }}
```


#### Key - Movie

```handlebars
{{ random 'Movie.quote' }}
```


#### Key - OnePiece

```handlebars
{{ random 'OnePiece.location' }}
{{ random 'OnePiece.quote' }}
{{ random 'OnePiece.character' }}
{{ random 'OnePiece.sea' }}
{{ random 'OnePiece.island' }}
{{ random 'OnePiece.akumasNoMi' }}
```


#### Key - OscarMovie

```handlebars
{{ random 'OscarMovie.quote' }}
{{ random 'OscarMovie.getYear' }}
{{ random 'OscarMovie.character' }}
{{ random 'OscarMovie.actor' }}
{{ random 'OscarMovie.getChoice' }}
{{ random 'OscarMovie.movieName' }}
{{ random 'OscarMovie.releaseDate' }}
```


#### Key - Pokemon

```handlebars
{{ random 'Pokemon.name' }}
{{ random 'Pokemon.type' }}
{{ random 'Pokemon.location' }}
{{ random 'Pokemon.move' }}
```


#### Key - PrincessBride

```handlebars
{{ random 'PrincessBride.quote' }}
{{ random 'PrincessBride.character' }}
```


#### Key - ResidentEvil

```handlebars
{{ random 'ResidentEvil.location' }}
{{ random 'ResidentEvil.character' }}
{{ random 'ResidentEvil.equipment' }}
{{ random 'ResidentEvil.creature' }}
{{ random 'ResidentEvil.biologicalAgent' }}
```


#### Key - RickAndMorty

```handlebars
{{ random 'RickAndMorty.location' }}
{{ random 'RickAndMorty.quote' }}
{{ random 'RickAndMorty.character' }}
```


#### Key - RuPaulDragRace

```handlebars
{{ random 'RuPaulDragRace.quote' }}
{{ random 'RuPaulDragRace.queen' }}
```


#### Key - Seinfeld

```handlebars
{{ random 'Seinfeld.quote' }}
{{ random 'Seinfeld.character' }}
{{ random 'Seinfeld.business' }}
```


#### Key - Simpsons

```handlebars
{{ random 'Simpsons.location' }}
{{ random 'Simpsons.quote' }}
{{ random 'Simpsons.character' }}
```


#### Key - StarTrek

```handlebars
{{ random 'StarTrek.location' }}
{{ random 'StarTrek.character' }}
{{ random 'StarTrek.species' }}
{{ random 'StarTrek.villain' }}
{{ random 'StarTrek.klingon' }}
```


#### Key - StarWars

```handlebars
{{ random 'StarWars.character' }}
{{ random 'StarWars.species' }}
{{ random 'StarWars.planets' }}
{{ random 'StarWars.quotes' }}
{{ random 'StarWars.callSign' }}
{{ random 'StarWars.vehicles' }}
{{ random 'StarWars.droids' }}
{{ random 'StarWars.alternateCharacterSpelling' }}
{{ random 'StarWars.wookieWords' }}
```


#### Key - StudioGhibli

```handlebars
{{ random 'StudioGhibli.quote' }}
{{ random 'StudioGhibli.character' }}
{{ random 'StudioGhibli.movie' }}
```


#### Key - TheItCrowd

```handlebars
{{ random 'TheItCrowd.characters' }}
{{ random 'TheItCrowd.quotes' }}
{{ random 'TheItCrowd.actors' }}
{{ random 'TheItCrowd.emails' }}
```


#### Key - TwinPeaks

```handlebars
{{ random 'TwinPeaks.location' }}
{{ random 'TwinPeaks.quote' }}
{{ random 'TwinPeaks.character' }}
```


#### Key - Witcher

```handlebars
{{ random 'Witcher.location' }}
{{ random 'Witcher.sign' }}
{{ random 'Witcher.quote' }}
{{ random 'Witcher.character' }}
{{ random 'Witcher.witcher' }}
{{ random 'Witcher.school' }}
{{ random 'Witcher.monster' }}
{{ random 'Witcher.potion' }}
{{ random 'Witcher.book' }}
```


### Category - Sport

#### Key - Baseball

```handlebars
{{ random 'Baseball.positions' }}
{{ random 'Baseball.players' }}
{{ random 'Baseball.teams' }}
{{ random 'Baseball.coaches' }}
```


#### Key - Basketball

```handlebars
{{ random 'Basketball.positions' }}
{{ random 'Basketball.players' }}
{{ random 'Basketball.teams' }}
{{ random 'Basketball.coaches' }}
```


#### Key - Cricket

```handlebars
{{ random 'Cricket.formats' }}
{{ random 'Cricket.players' }}
{{ random 'Cricket.teams' }}
{{ random 'Cricket.tournaments' }}
```


#### Key - EnglandFootBall

```handlebars
{{ random 'EnglandFootBall.team' }}
{{ random 'EnglandFootBall.league' }}
```


#### Key - Football

```handlebars
{{ random 'Football.positions' }}
{{ random 'Football.players' }}
{{ random 'Football.teams' }}
{{ random 'Football.coaches' }}
{{ random 'Football.competitions' }}
```


#### Key - Formula1

```handlebars
{{ random 'Formula1.team' }}
{{ random 'Formula1.driver' }}
{{ random 'Formula1.circuit' }}
{{ random 'Formula1.grandPrix' }}
```


#### Key - Volleyball

```handlebars
{{ random 'Volleyball.position' }}
{{ random 'Volleyball.team' }}
{{ random 'Volleyball.player' }}
{{ random 'Volleyball.coach' }}
{{ random 'Volleyball.formation' }}
```


### Category - Video Games

#### Key - Battlefield1

```handlebars
{{ random 'Battlefield1.map' }}
{{ random 'Battlefield1.classes' }}
{{ random 'Battlefield1.weapon' }}
{{ random 'Battlefield1.vehicle' }}
{{ random 'Battlefield1.faction' }}
```


#### Key - ClashOfClans

```handlebars
{{ random 'ClashOfClans.troop' }}
{{ random 'ClashOfClans.rank' }}
{{ random 'ClashOfClans.defensiveBuilding' }}
```


#### Key - Control

```handlebars
{{ random 'Control.location' }}
{{ random 'Control.quote' }}
{{ random 'Control.character' }}
{{ random 'Control.hiss' }}
{{ random 'Control.theBoard' }}
{{ random 'Control.objectOfPower' }}
{{ random 'Control.alteredItem' }}
{{ random 'Control.alteredWorldEvent' }}
```


#### Key - ElderScrolls

```handlebars
{{ random 'ElderScrolls.quote' }}
{{ random 'ElderScrolls.lastName' }}
{{ random 'ElderScrolls.region' }}
{{ random 'ElderScrolls.race' }}
{{ random 'ElderScrolls.creature' }}
{{ random 'ElderScrolls.firstName' }}
{{ random 'ElderScrolls.city' }}
{{ random 'ElderScrolls.dragon' }}
```


#### Key - Esports

```handlebars
{{ random 'Esports.event' }}
{{ random 'Esports.game' }}
{{ random 'Esports.team' }}
{{ random 'Esports.player' }}
{{ random 'Esports.league' }}
```


#### Key - Fallout

```handlebars
{{ random 'Fallout.location' }}
{{ random 'Fallout.quote' }}
{{ random 'Fallout.character' }}
{{ random 'Fallout.faction' }}
```


#### Key - Hearthstone

```handlebars
{{ random 'Hearthstone.wildRank' }}
{{ random 'Hearthstone.mainProfession' }}
{{ random 'Hearthstone.mainCharacter' }}
{{ random 'Hearthstone.mainPattern' }}
{{ random 'Hearthstone.battlegroundsScore' }}
{{ random 'Hearthstone.standardRank' }}
```


#### Key - HeroesOfTheStorm

```handlebars
{{ random 'HeroesOfTheStorm.quote' }}
{{ random 'HeroesOfTheStorm.hero' }}
{{ random 'HeroesOfTheStorm.heroClass' }}
{{ random 'HeroesOfTheStorm.battleground' }}
```


#### Key - LeagueOfLegends

```handlebars
{{ random 'LeagueOfLegends.location' }}
{{ random 'LeagueOfLegends.quote' }}
{{ random 'LeagueOfLegends.rank' }}
{{ random 'LeagueOfLegends.champion' }}
{{ random 'LeagueOfLegends.masteries' }}
{{ random 'LeagueOfLegends.summonerSpell' }}
```


#### Key - MassEffect

```handlebars
{{ random 'MassEffect.quote' }}
{{ random 'MassEffect.character' }}
{{ random 'MassEffect.planet' }}
{{ random 'MassEffect.specie' }}
{{ random 'MassEffect.cluster' }}
```


#### Key - Minecraft

```handlebars
{{ random 'Minecraft.itemName' }}
{{ random 'Minecraft.tileName' }}
{{ random 'Minecraft.entityName' }}
{{ random 'Minecraft.animalName' }}
{{ random 'Minecraft.monsterName' }}
{{ random 'Minecraft.tileItemName' }}
```


#### Key - Overwatch

```handlebars
{{ random 'Overwatch.location' }}
{{ random 'Overwatch.quote' }}
{{ random 'Overwatch.hero' }}
```


#### Key - SoulKnight

```handlebars
{{ random 'SoulKnight.characters' }}
{{ random 'SoulKnight.buffs' }}
{{ random 'SoulKnight.statues' }}
{{ random 'SoulKnight.weapons' }}
{{ random 'SoulKnight.bosses' }}
{{ random 'SoulKnight.enemies' }}
```


#### Key - StarCraft

```handlebars
{{ random 'StarCraft.unit' }}
{{ random 'StarCraft.character' }}
{{ random 'StarCraft.planet' }}
{{ random 'StarCraft.building' }}
```


#### Key - SuperMario

```handlebars
{{ random 'SuperMario.locations' }}
{{ random 'SuperMario.games' }}
{{ random 'SuperMario.characters' }}
```


#### Key - Touhou

```handlebars
{{ random 'Touhou.trackName' }}
{{ random 'Touhou.gameName' }}
{{ random 'Touhou.characterName' }}
{{ random 'Touhou.characterFirstName' }}
{{ random 'Touhou.characterLastName' }}
```


#### Key - Zelda

```handlebars
{{ random 'Zelda.character' }}
{{ random 'Zelda.game' }}
```

