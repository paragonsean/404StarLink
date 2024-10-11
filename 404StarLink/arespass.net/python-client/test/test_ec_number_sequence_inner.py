# coding: utf-8

"""
    Arespass

    Analyzes a password and calculates its entropy.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.ec_number_sequence_inner import EcNumberSequenceInner

class TestEcNumberSequenceInner(unittest.TestCase):
    """EcNumberSequenceInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EcNumberSequenceInner:
        """Test EcNumberSequenceInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EcNumberSequenceInner`
        """
        model = EcNumberSequenceInner()
        if include_optional:
            return EcNumberSequenceInner(
                char = '',
                l33tchar = '',
                penalty = 1.337
            )
        else:
            return EcNumberSequenceInner(
        )
        """

    def testEcNumberSequenceInner(self):
        """Test EcNumberSequenceInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
