SUMMARY = "The new Python SDK for Sentry.io"
DESCRIPTION = "This is the next line of the Python SDK \
for Sentry, intended to replace the raven package on PyPI."
HOMEPAGE = "https://github.com/getsentry/sentry-python"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c79f8d3c91fc847350efd28bfe0a341"

SRC_URI[md5sum] = "5806e450b2a4e341478411bc5d5cef31"
SRC_URI[sha256sum] = "09cbc253c827a88064c5ed548d24fb4294568bfe9b1816a857fa5a423d4ce762"

PYPI_PACKAGE = "sentry-sdk"
inherit pypi setuptools3
