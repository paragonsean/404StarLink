# coding: utf-8

"""
    eBay Finances API

    This API is used to retrieve seller payouts and monetary transaction details related to those payouts.

    The version of the OpenAPI document: v1.15.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.balance_adjustment import BalanceAdjustment

class TestBalanceAdjustment(unittest.TestCase):
    """BalanceAdjustment unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BalanceAdjustment:
        """Test BalanceAdjustment
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BalanceAdjustment`
        """
        model = BalanceAdjustment()
        if include_optional:
            return BalanceAdjustment(
                adjustment_amount = openapi_client.models.amount.Amount(
                    converted_from_currency = '', 
                    converted_from_value = '', 
                    currency = '', 
                    exchange_rate = '', 
                    value = '', ),
                adjustment_type = ''
            )
        else:
            return BalanceAdjustment(
        )
        """

    def testBalanceAdjustment(self):
        """Test BalanceAdjustment"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
