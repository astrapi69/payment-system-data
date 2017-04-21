# payment-system-data

Parent project that holds module projects for the persistence of payment data. This project is in beta state and are not intended to use in production.

The project holds backend data for simple payment data.

## License

The source code comes under the liberal MIT License.

# Build status
[![Build Status](https://travis-ci.org/lightblueseas/payment-system-data.svg?branch=master)](https://travis-ci.org/lightblueseas/payment-system-data)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/payment-system-data/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/payment-system-data)

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~payment-system-data~~~) for latest snapshots and releases.

Add the following maven dependencies to your project `pom.xml` if you want to import the core functionality:

You can first define the version properties:

	<properties>
			...
		<!-- payment-system-data version -->
		<payment-system-data.version>3.11.0</payment-system-data.version>
		<payment-system-domain.version>${payment-system-data.version}</payment-system-domain.version>
		<payment-system-entities.version>${payment-system-data.version}</payment-system-entities.version>
			...
	</properties>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of payment-system-domain:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>payment-system-domain</artifactId>
				<version>${payment-system-domain.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of payment-system-entities:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>payment-system-entities</artifactId>
				<version>${payment-system-entities.version}</version>
			</dependency>
			...
		</dependencies>


## Want to Help and improve it? ###

The source code for payment-system-data are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/payment-system-data/fork](https://github.com/lightblueseas/payment-system-data/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/payment-system-data/pull/new/master).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the payment-system-data developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/payment-system-data/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Fpayment-system-data" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>
