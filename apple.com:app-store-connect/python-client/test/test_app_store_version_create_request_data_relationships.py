# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_store_version_create_request_data_relationships import AppStoreVersionCreateRequestDataRelationships

class TestAppStoreVersionCreateRequestDataRelationships(unittest.TestCase):
    """AppStoreVersionCreateRequestDataRelationships unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppStoreVersionCreateRequestDataRelationships:
        """Test AppStoreVersionCreateRequestDataRelationships
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppStoreVersionCreateRequestDataRelationships`
        """
        model = AppStoreVersionCreateRequestDataRelationships()
        if include_optional:
            return AppStoreVersionCreateRequestDataRelationships(
                app = openapi_client.models.app_pre_order_create_request_data_relationships_app.AppPreOrderCreateRequest_data_relationships_app(
                    data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                        id = '', 
                        type = 'apps', ), ),
                build = openapi_client.models.app_store_version_create_request_data_relationships_build.AppStoreVersionCreateRequest_data_relationships_build(
                    data = openapi_client.models.app_relationships_builds_data_inner.App_relationships_builds_data_inner(
                        id = '', 
                        type = 'builds', ), )
            )
        else:
            return AppStoreVersionCreateRequestDataRelationships(
                app = openapi_client.models.app_pre_order_create_request_data_relationships_app.AppPreOrderCreateRequest_data_relationships_app(
                    data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                        id = '', 
                        type = 'apps', ), ),
        )
        """

    def testAppStoreVersionCreateRequestDataRelationships(self):
        """Test AppStoreVersionCreateRequestDataRelationships"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
