# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_info_update_request_data_relationships import AppInfoUpdateRequestDataRelationships

class TestAppInfoUpdateRequestDataRelationships(unittest.TestCase):
    """AppInfoUpdateRequestDataRelationships unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppInfoUpdateRequestDataRelationships:
        """Test AppInfoUpdateRequestDataRelationships
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppInfoUpdateRequestDataRelationships`
        """
        model = AppInfoUpdateRequestDataRelationships()
        if include_optional:
            return AppInfoUpdateRequestDataRelationships(
                primary_category = openapi_client.models.app_info_update_request_data_relationships_primary_category.AppInfoUpdateRequest_data_relationships_primaryCategory(
                    data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                        id = '', 
                        type = 'appCategories', ), ),
                primary_subcategory_one = openapi_client.models.app_info_update_request_data_relationships_primary_category.AppInfoUpdateRequest_data_relationships_primaryCategory(
                    data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                        id = '', 
                        type = 'appCategories', ), ),
                primary_subcategory_two = openapi_client.models.app_info_update_request_data_relationships_primary_category.AppInfoUpdateRequest_data_relationships_primaryCategory(
                    data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                        id = '', 
                        type = 'appCategories', ), ),
                secondary_category = openapi_client.models.app_info_update_request_data_relationships_primary_category.AppInfoUpdateRequest_data_relationships_primaryCategory(
                    data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                        id = '', 
                        type = 'appCategories', ), ),
                secondary_subcategory_one = openapi_client.models.app_info_update_request_data_relationships_primary_category.AppInfoUpdateRequest_data_relationships_primaryCategory(
                    data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                        id = '', 
                        type = 'appCategories', ), ),
                secondary_subcategory_two = openapi_client.models.app_info_update_request_data_relationships_primary_category.AppInfoUpdateRequest_data_relationships_primaryCategory(
                    data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                        id = '', 
                        type = 'appCategories', ), )
            )
        else:
            return AppInfoUpdateRequestDataRelationships(
        )
        """

    def testAppInfoUpdateRequestDataRelationships(self):
        """Test AppInfoUpdateRequestDataRelationships"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
