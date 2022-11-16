# coding: utf-8

"""
    eBay Finances API

    This API is used to retrieve seller payouts and monetary transaction details related to those payouts.

    The version of the OpenAPI document: v1.15.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.seller_funds_summary_response import SellerFundsSummaryResponse

class TestSellerFundsSummaryResponse(unittest.TestCase):
    """SellerFundsSummaryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SellerFundsSummaryResponse:
        """Test SellerFundsSummaryResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SellerFundsSummaryResponse`
        """
        model = SellerFundsSummaryResponse()
        if include_optional:
            return SellerFundsSummaryResponse(
                available_funds = openapi_client.models.amount.Amount(
                    converted_from_currency = '', 
                    converted_from_value = '', 
                    currency = '', 
                    exchange_rate = '', 
                    value = '', ),
                funds_on_hold = openapi_client.models.amount.Amount(
                    converted_from_currency = '', 
                    converted_from_value = '', 
                    currency = '', 
                    exchange_rate = '', 
                    value = '', ),
                processing_funds = openapi_client.models.amount.Amount(
                    converted_from_currency = '', 
                    converted_from_value = '', 
                    currency = '', 
                    exchange_rate = '', 
                    value = '', ),
                total_funds = openapi_client.models.amount.Amount(
                    converted_from_currency = '', 
                    converted_from_value = '', 
                    currency = '', 
                    exchange_rate = '', 
                    value = '', )
            )
        else:
            return SellerFundsSummaryResponse(
        )
        """

    def testSellerFundsSummaryResponse(self):
        """Test SellerFundsSummaryResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
