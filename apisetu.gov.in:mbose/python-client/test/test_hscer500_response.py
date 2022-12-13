# coding: utf-8

"""
    Meghalaya Board of School Education, Tura, Meghalaya

    Meghalaya Board of School Education (MBOSE) with Marksheets of Class Xth and Class XIIth (Arts , Science, Commerce and Vocational), is availablke on DigiLocker for the students of 2015-2019.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.hscer500_response import Hscer500Response

class TestHscer500Response(unittest.TestCase):
    """Hscer500Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Hscer500Response:
        """Test Hscer500Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Hscer500Response`
        """
        model = Hscer500Response()
        if include_optional:
            return Hscer500Response(
                error = 'internal_server_error',
                error_description = 'Internal server error'
            )
        else:
            return Hscer500Response(
        )
        """

    def testHscer500Response(self):
        """Test Hscer500Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
