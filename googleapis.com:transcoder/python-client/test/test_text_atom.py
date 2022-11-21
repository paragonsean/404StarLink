# coding: utf-8

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.text_atom import TextAtom

class TestTextAtom(unittest.TestCase):
    """TextAtom unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TextAtom:
        """Test TextAtom
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TextAtom`
        """
        model = TextAtom()
        if include_optional:
            return TextAtom(
                inputs = [
                    openapi_client.models.text_input.TextInput(
                        key = '', 
                        track = 56, )
                    ],
                key = ''
            )
        else:
            return TextAtom(
        )
        """

    def testTextAtom(self):
        """Test TextAtom"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
