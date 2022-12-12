# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.hiu_subscription_request_notification_acknowledgement_acknowledgement import HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement

class TestHIUSubscriptionRequestNotificationAcknowledgementAcknowledgement(unittest.TestCase):
    """HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement:
        """Test HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement`
        """
        model = HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement()
        if include_optional:
            return HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement(
                status = 'OK',
                subscription_request_id = 'subscription Id'
            )
        else:
            return HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement(
                status = 'OK',
                subscription_request_id = 'subscription Id',
        )
        """

    def testHIUSubscriptionRequestNotificationAcknowledgementAcknowledgement(self):
        """Test HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
