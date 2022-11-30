# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.referee import Referee

class TestReferee(unittest.TestCase):
    """Referee unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Referee:
        """Test Referee
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Referee`
        """
        model = Referee()
        if include_optional:
            return Referee(
                first_name = '',
                last_name = '',
                nationality = '',
                referee_id = 56,
                short_name = ''
            )
        else:
            return Referee(
        )
        """

    def testReferee(self):
        """Test Referee"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
