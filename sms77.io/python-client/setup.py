# coding: utf-8

"""
    sms77.io API

    sms77.io Swagger API. Get your API-Key now at sms77.io.

    The version of the OpenAPI document: 1.0.0
    Contact: support@sms77.io
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
    description="sms77.io API",
    author="Support",
    author_email="support@sms77.io",
    url="",
    keywords=["OpenAPI", "OpenAPI-Generator", "sms77.io API"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Licensed by Apache 2.0",
    long_description_content_type='text/markdown',
    long_description="""\
    sms77.io Swagger API. Get your API-Key now at sms77.io.
    """,  # noqa: E501
    package_data={"openapi_client": ["py.typed"]},
)
