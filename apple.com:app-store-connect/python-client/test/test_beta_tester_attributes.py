# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.beta_tester_attributes import BetaTesterAttributes

class TestBetaTesterAttributes(unittest.TestCase):
    """BetaTesterAttributes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BetaTesterAttributes:
        """Test BetaTesterAttributes
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BetaTesterAttributes`
        """
        model = BetaTesterAttributes()
        if include_optional:
            return BetaTesterAttributes(
                email = '',
                first_name = '',
                invite_type = 'EMAIL',
                last_name = ''
            )
        else:
            return BetaTesterAttributes(
        )
        """

    def testBetaTesterAttributes(self):
        """Test BetaTesterAttributes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
