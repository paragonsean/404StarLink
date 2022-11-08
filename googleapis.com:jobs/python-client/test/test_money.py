# coding: utf-8

"""
    Cloud Talent Solution API

    Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 

    The version of the OpenAPI document: v3p1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.money import Money

class TestMoney(unittest.TestCase):
    """Money unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Money:
        """Test Money
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Money`
        """
        model = Money()
        if include_optional:
            return Money(
                currency_code = '',
                nanos = 56,
                units = ''
            )
        else:
            return Money(
        )
        """

    def testMoney(self):
        """Test Money"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
