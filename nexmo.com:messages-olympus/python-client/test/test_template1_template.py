# coding: utf-8

"""
    Messages API

    The Messages API consolidates and normalises exchanges across all messaging channels. It allows you to use a single API to interact with our various channels such as SMS, MMS, WhatsApp, Viber and Facebook Messenger

    The version of the OpenAPI document: 1.4.0
    Contact: devrel@nexmo.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.template1_template import Template1Template

class TestTemplate1Template(unittest.TestCase):
    """Template1Template unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Template1Template:
        """Test Template1Template
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Template1Template`
        """
        model = Template1Template()
        if include_optional:
            return Template1Template(
                name = '9b6b4fcb_da19_4a26_8fe8_78074a91b584:verify',
                parameters = ["Verification","2526","5"]
            )
        else:
            return Template1Template(
                name = '9b6b4fcb_da19_4a26_8fe8_78074a91b584:verify',
        )
        """

    def testTemplate1Template(self):
        """Test Template1Template"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
