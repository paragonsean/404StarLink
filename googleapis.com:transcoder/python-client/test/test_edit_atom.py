# coding: utf-8

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.edit_atom import EditAtom

class TestEditAtom(unittest.TestCase):
    """EditAtom unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EditAtom:
        """Test EditAtom
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EditAtom`
        """
        model = EditAtom()
        if include_optional:
            return EditAtom(
                end_time_offset = '',
                inputs = [
                    ''
                    ],
                key = '',
                start_time_offset = ''
            )
        else:
            return EditAtom(
        )
        """

    def testEditAtom(self):
        """Test EditAtom"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
