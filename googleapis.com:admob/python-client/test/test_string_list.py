# coding: utf-8

"""
    AdMob API

    The AdMob API allows publishers to programmatically get information about their AdMob account. 

    The version of the OpenAPI document: v1beta
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.string_list import StringList

class TestStringList(unittest.TestCase):
    """StringList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StringList:
        """Test StringList
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StringList`
        """
        model = StringList()
        if include_optional:
            return StringList(
                values = [
                    ''
                    ]
            )
        else:
            return StringList(
        )
        """

    def testStringList(self):
        """Test StringList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
