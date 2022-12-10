# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_pre_order_attributes import AppPreOrderAttributes

class TestAppPreOrderAttributes(unittest.TestCase):
    """AppPreOrderAttributes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppPreOrderAttributes:
        """Test AppPreOrderAttributes
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppPreOrderAttributes`
        """
        model = AppPreOrderAttributes()
        if include_optional:
            return AppPreOrderAttributes(
                app_release_date = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(),
                pre_order_available_date = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date()
            )
        else:
            return AppPreOrderAttributes(
        )
        """

    def testAppPreOrderAttributes(self):
        """Test AppPreOrderAttributes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
