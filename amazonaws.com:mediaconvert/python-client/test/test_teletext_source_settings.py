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

from openapi_client.models.teletext_source_settings import TeletextSourceSettings

class TestTeletextSourceSettings(unittest.TestCase):
    """TeletextSourceSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TeletextSourceSettings:
        """Test TeletextSourceSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TeletextSourceSettings`
        """
        model = TeletextSourceSettings()
        if include_optional:
            return TeletextSourceSettings(
                page_number = None
            )
        else:
            return TeletextSourceSettings(
        )
        """

    def testTeletextSourceSettings(self):
        """Test TeletextSourceSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
