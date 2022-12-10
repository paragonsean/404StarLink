# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_info_update_request_data_relationships_primary_category import AppInfoUpdateRequestDataRelationshipsPrimaryCategory

class TestAppInfoUpdateRequestDataRelationshipsPrimaryCategory(unittest.TestCase):
    """AppInfoUpdateRequestDataRelationshipsPrimaryCategory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Test AppInfoUpdateRequestDataRelationshipsPrimaryCategory
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppInfoUpdateRequestDataRelationshipsPrimaryCategory`
        """
        model = AppInfoUpdateRequestDataRelationshipsPrimaryCategory()
        if include_optional:
            return AppInfoUpdateRequestDataRelationshipsPrimaryCategory(
                data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                    id = '', 
                    type = 'appCategories', )
            )
        else:
            return AppInfoUpdateRequestDataRelationshipsPrimaryCategory(
        )
        """

    def testAppInfoUpdateRequestDataRelationshipsPrimaryCategory(self):
        """Test AppInfoUpdateRequestDataRelationshipsPrimaryCategory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
