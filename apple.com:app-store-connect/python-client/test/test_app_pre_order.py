# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_pre_order import AppPreOrder

class TestAppPreOrder(unittest.TestCase):
    """AppPreOrder unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppPreOrder:
        """Test AppPreOrder
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppPreOrder`
        """
        model = AppPreOrder()
        if include_optional:
            return AppPreOrder(
                attributes = openapi_client.models.app_pre_order_attributes.AppPreOrder_attributes(
                    app_release_date = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(), 
                    pre_order_available_date = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(), ),
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                relationships = openapi_client.models.app_encryption_declaration_relationships.AppEncryptionDeclaration_relationships(
                    app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                        data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                            id = '', 
                            type = 'apps', ), 
                        links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                            related = '', 
                            self = '', ), ), ),
                type = 'appPreOrders'
            )
        else:
            return AppPreOrder(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'appPreOrders',
        )
        """

    def testAppPreOrder(self):
        """Test AppPreOrder"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
