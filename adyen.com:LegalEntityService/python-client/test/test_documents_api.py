# coding: utf-8

"""
    Legal Entity Management API

    The Legal Entity Management API enables you to manage legal entities that contain information required for verification.  ## Authentication To connect to the Legal Entity Management API, you must use the basic authentication credentials of your web service user. If you don't have one, contact the [Adyen Support Team](https://www.adyen.help/hc/en-us/requests/new). Use the web service user credentials to authenticate your request, for example:  ``` curl -U \"ws_123456@Scope.BalancePlatform_YourBalancePlatform\":\"YourWsPassword\" \\ -H \"Content-Type: application/json\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Legal Entity Management API supports versioning of its endpoints through a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://kyc-test.adyen.com/lem/v3/legalEntities ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://kyc-live.adyen.com/lem/v3`.  

    The version of the OpenAPI document: 3
    Contact: developer-experience@adyen.com
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

    def test_delete_documents_id(self) -> None:
        """Test case for delete_documents_id

        Delete a document
        """
        pass

    def test_get_documents_id(self) -> None:
        """Test case for get_documents_id

        Get a document
        """
        pass

    def test_patch_documents_id(self) -> None:
        """Test case for patch_documents_id

        Update a document
        """
        pass

    def test_post_documents(self) -> None:
        """Test case for post_documents

        Upload a document for verification checks
        """
        pass


if __name__ == '__main__':
    unittest.main()
