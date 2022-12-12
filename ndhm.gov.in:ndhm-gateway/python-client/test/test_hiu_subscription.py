# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.hiu_subscription import HIUSubscription

class TestHIUSubscription(unittest.TestCase):
    """HIUSubscription unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> HIUSubscription:
        """Test HIUSubscription
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HIUSubscription`
        """
        model = HIUSubscription()
        if include_optional:
            return HIUSubscription(
                hiu = openapi_client.models.organization_representation.OrganizationRepresentation(
                    id = '', ),
                id = 'subscription Id',
                patient = openapi_client.models.consent_manager_patient_id.ConsentManagerPatientID(
                    id = 'hinapatel79@ndhm', ),
                sources = [
                    openapi_client.models.hiu_subscription_context.HIUSubscriptionContext(
                        categories = [
                            'LINK'
                            ], 
                        hip = openapi_client.models.organization_representation.OrganizationRepresentation(
                            id = '', ), 
                        period = openapi_client.models.subscription_period.SubscriptionPeriod(
                            from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), )
                    ]
            )
        else:
            return HIUSubscription(
                hiu = openapi_client.models.organization_representation.OrganizationRepresentation(
                    id = '', ),
                id = 'subscription Id',
                patient = openapi_client.models.consent_manager_patient_id.ConsentManagerPatientID(
                    id = 'hinapatel79@ndhm', ),
                sources = [
                    openapi_client.models.hiu_subscription_context.HIUSubscriptionContext(
                        categories = [
                            'LINK'
                            ], 
                        hip = openapi_client.models.organization_representation.OrganizationRepresentation(
                            id = '', ), 
                        period = openapi_client.models.subscription_period.SubscriptionPeriod(
                            from = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            to = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), )
                    ],
        )
        """

    def testHIUSubscription(self):
        """Test HIUSubscription"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
