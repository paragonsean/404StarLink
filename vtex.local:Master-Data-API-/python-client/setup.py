# coding: utf-8

"""
    Master Data API - v2

    # ATTENTION: **This version isn't compliant with data entities of old version (e.g. CL and AD). It's possible to use this configuration only to new data entities.**      ## Welcome!    VTEX Master Data is an easy-to-use, secure, fast, scalable and extensible repository. On it you can create your own Entities, store data and consult directly from the storefront or use it to store info for some external integration.    There are internal VTEX modules that use VTEX Master Data as data repository. We have the VTEX Customer Service, VTEX Profile System and VTEX InStore, for example. It is also used by other internal services.    There are two ways to use Master Data:    1. Directly from the storefront  2. External integration    ### Directly from the storefront    If your scenario is to be used inside the storefront, be aware of the following observations:    1. Use the storefront host to query or store information to avoid **CORS**;  2. Configure which information should be public and which shouldn't, inside the JSON Schema of the Data Entity;  3. Do not create query loops (the storefront may be affected with Throttling and apis may be turned off as a security protection);  4. Never add via JS any type of authentication key (x-vtex-api-appkey or x-vtex-api-apptoken);    **It's important to avoid CORS using the relative path**    ### External Integration    If your scenario is to perform external integration, such as migrating client data from another service, be aware of the following observations:    1. Use the host ```{{accountName}}.vtexcommercestable.com.br```;  2. Use the authentication keys (x-vtex-api-appkey ou x-vtex-api-apptoken);    ### Most used attributes listed here    | Name | Description |  | -------- | -------- |  | accountName | Account name in VTEX License Manager |  | name | Data Entity name |  | schema | JSON Schema of a Data Entity |  | id | Identifier of a document |  | x-vtex-api-appKey | User key |  | x-vtex-api-appToken | User token |

    The version of the OpenAPI document: 1.0
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
    description="Master Data API - v2",
    author="OpenAPI Generator community",
    author_email="team@openapitools.org",
    url="",
    keywords=["OpenAPI", "OpenAPI-Generator", "Master Data API - v2"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description_content_type='text/markdown',
    long_description="""\
    # ATTENTION: **This version isn&#39;t compliant with data entities of old version (e.g. CL and AD). It&#39;s possible to use this configuration only to new data entities.**      ## Welcome!    VTEX Master Data is an easy-to-use, secure, fast, scalable and extensible repository. On it you can create your own Entities, store data and consult directly from the storefront or use it to store info for some external integration.    There are internal VTEX modules that use VTEX Master Data as data repository. We have the VTEX Customer Service, VTEX Profile System and VTEX InStore, for example. It is also used by other internal services.    There are two ways to use Master Data:    1. Directly from the storefront  2. External integration    ### Directly from the storefront    If your scenario is to be used inside the storefront, be aware of the following observations:    1. Use the storefront host to query or store information to avoid **CORS**;  2. Configure which information should be public and which shouldn&#39;t, inside the JSON Schema of the Data Entity;  3. Do not create query loops (the storefront may be affected with Throttling and apis may be turned off as a security protection);  4. Never add via JS any type of authentication key (x-vtex-api-appkey or x-vtex-api-apptoken);    **It&#39;s important to avoid CORS using the relative path**    ### External Integration    If your scenario is to perform external integration, such as migrating client data from another service, be aware of the following observations:    1. Use the host &#x60;&#x60;&#x60;{{accountName}}.vtexcommercestable.com.br&#x60;&#x60;&#x60;;  2. Use the authentication keys (x-vtex-api-appkey ou x-vtex-api-apptoken);    ### Most used attributes listed here    | Name | Description |  | -------- | -------- |  | accountName | Account name in VTEX License Manager |  | name | Data Entity name |  | schema | JSON Schema of a Data Entity |  | id | Identifier of a document |  | x-vtex-api-appKey | User key |  | x-vtex-api-appToken | User token |
    """,  # noqa: E501
    package_data={"openapi_client": ["py.typed"]},
)
