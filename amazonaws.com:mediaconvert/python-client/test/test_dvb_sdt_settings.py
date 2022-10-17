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

from openapi_client.models.dvb_sdt_settings import DvbSdtSettings

class TestDvbSdtSettings(unittest.TestCase):
    """DvbSdtSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DvbSdtSettings:
        """Test DvbSdtSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DvbSdtSettings`
        """
        model = DvbSdtSettings()
        if include_optional:
            return DvbSdtSettings(
                output_sdt = None,
                sdt_interval = None,
                service_name = None,
                service_provider_name = None
            )
        else:
            return DvbSdtSettings(
        )
        """

    def testDvbSdtSettings(self):
        """Test DvbSdtSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
