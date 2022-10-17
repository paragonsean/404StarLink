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

from openapi_client.models.mov_settings import MovSettings

class TestMovSettings(unittest.TestCase):
    """MovSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MovSettings:
        """Test MovSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MovSettings`
        """
        model = MovSettings()
        if include_optional:
            return MovSettings(
                clap_atom = None,
                cslg_atom = None,
                mpeg2_four_cc_control = None,
                padding_control = None,
                reference = None
            )
        else:
            return MovSettings(
        )
        """

    def testMovSettings(self):
        """Test MovSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
