# coding: utf-8

"""
    Mailscript

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.4.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.get_all_verifications_response import GetAllVerificationsResponse

class TestGetAllVerificationsResponse(unittest.TestCase):
    """GetAllVerificationsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetAllVerificationsResponse:
        """Test GetAllVerificationsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetAllVerificationsResponse`
        """
        model = GetAllVerificationsResponse()
        if include_optional:
            return GetAllVerificationsResponse(
                list = [
                    null
                    ]
            )
        else:
            return GetAllVerificationsResponse(
                list = [
                    null
                    ],
        )
        """

    def testGetAllVerificationsResponse(self):
        """Test GetAllVerificationsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
