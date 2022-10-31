# coding: utf-8

"""
    Routing

    Routing consists of the following service: <b>Calculate Route</b> Calculates a route between an origin and a destination, passing through waypoints (if specified). Additional routing parameters like traffic, avoidance conditions, departure/arrival time etc. can be taken into account. <b>Calculate Reachable Range</b> Calculates a set of locations that can be reached from the origin point, subject to the available fuel or energy budget that is specified in the request.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from setuptools import setup, find_packages  # noqa: H301

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools
NAME = "openapi-client"
VERSION = "1.0.0"
PYTHON_REQUIRES = ">= 3.8"
REQUIRES = [
    "urllib3 >= 1.25.3, < 3.0.0",
    "python-dateutil >= 2.8.2",
    "pydantic >= 2",
    "typing-extensions >= 4.7.1",
]

setup(
    name=NAME,
    version=VERSION,
    description="Routing",
    author="Contact Us",
    author_email="team@openapitools.org",
    url="",
    keywords=["OpenAPI", "OpenAPI-Generator", "Routing"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description_content_type='text/markdown',
    long_description="""\
    Routing consists of the following service: &lt;b&gt;Calculate Route&lt;/b&gt; Calculates a route between an origin and a destination, passing through waypoints (if specified). Additional routing parameters like traffic, avoidance conditions, departure/arrival time etc. can be taken into account. &lt;b&gt;Calculate Reachable Range&lt;/b&gt; Calculates a set of locations that can be reached from the origin point, subject to the available fuel or energy budget that is specified in the request.
    """,  # noqa: E501
    package_data={"openapi_client": ["py.typed"]},
)
