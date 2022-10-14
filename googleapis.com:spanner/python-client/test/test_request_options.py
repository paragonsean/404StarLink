# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.request_options import RequestOptions

class TestRequestOptions(unittest.TestCase):
    """RequestOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RequestOptions:
        """Test RequestOptions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RequestOptions`
        """
        model = RequestOptions()
        if include_optional:
            return RequestOptions(
                priority = 'PRIORITY_UNSPECIFIED',
                request_tag = '',
                transaction_tag = ''
            )
        else:
            return RequestOptions(
        )
        """

    def testRequestOptions(self):
        """Test RequestOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
