# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.get_policy_response_policy import GetPolicyResponsePolicy

class TestGetPolicyResponsePolicy(unittest.TestCase):
    """GetPolicyResponsePolicy unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetPolicyResponsePolicy:
        """Test GetPolicyResponsePolicy
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetPolicyResponsePolicy`
        """
        model = GetPolicyResponsePolicy()
        if include_optional:
            return GetPolicyResponsePolicy(
                http_inputs = None,
                https_inputs = None,
                s3_inputs = None
            )
        else:
            return GetPolicyResponsePolicy(
        )
        """

    def testGetPolicyResponsePolicy(self):
        """Test GetPolicyResponsePolicy"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
