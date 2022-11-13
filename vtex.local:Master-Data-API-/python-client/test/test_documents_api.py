# coding: utf-8

"""
    Master Data API - v2

    # ATTENTION: **This version isn't compliant with data entities of old version (e.g. CL and AD). It's possible to use this configuration only to new data entities.**      ## Welcome!    VTEX Master Data is an easy-to-use, secure, fast, scalable and extensible repository. On it you can create your own Entities, store data and consult directly from the storefront or use it to store info for some external integration.    There are internal VTEX modules that use VTEX Master Data as data repository. We have the VTEX Customer Service, VTEX Profile System and VTEX InStore, for example. It is also used by other internal services.    There are two ways to use Master Data:    1. Directly from the storefront  2. External integration    ### Directly from the storefront    If your scenario is to be used inside the storefront, be aware of the following observations:    1. Use the storefront host to query or store information to avoid **CORS**;  2. Configure which information should be public and which shouldn't, inside the JSON Schema of the Data Entity;  3. Do not create query loops (the storefront may be affected with Throttling and apis may be turned off as a security protection);  4. Never add via JS any type of authentication key (x-vtex-api-appkey or x-vtex-api-apptoken);    **It's important to avoid CORS using the relative path**    ### External Integration    If your scenario is to perform external integration, such as migrating client data from another service, be aware of the following observations:    1. Use the host ```{{accountName}}.vtexcommercestable.com.br```;  2. Use the authentication keys (x-vtex-api-appkey ou x-vtex-api-apptoken);    ### Most used attributes listed here    | Name | Description |  | -------- | -------- |  | accountName | Account name in VTEX License Manager |  | name | Data Entity name |  | schema | JSON Schema of a Data Entity |  | id | Identifier of a document |  | x-vtex-api-appKey | User key |  | x-vtex-api-appToken | User token |

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.documents_api import DocumentsApi


class TestDocumentsApi(unittest.TestCase):
    """DocumentsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DocumentsApi()

    def tearDown(self) -> None:
        pass

    def test_createnewdocument(self) -> None:
        """Test case for createnewdocument

        Create new document
        """
        pass

    def test_createorupdatepartialdocument(self) -> None:
        """Test case for createorupdatepartialdocument

        Create partial document
        """
        pass

    def test_deletedocument(self) -> None:
        """Test case for deletedocument

        Delete document
        """
        pass

    def test_getdocument(self) -> None:
        """Test case for getdocument

        Get document
        """
        pass

    def test_updateentiredocument(self) -> None:
        """Test case for updateentiredocument

        Update entire document
        """
        pass

    def test_updatepartialdocument(self) -> None:
        """Test case for updatepartialdocument

        Update partial document
        """
        pass


if __name__ == '__main__':
    unittest.main()
