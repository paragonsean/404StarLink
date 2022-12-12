# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.patient_auth_confirm_response_auth import PatientAuthConfirmResponseAuth

class TestPatientAuthConfirmResponseAuth(unittest.TestCase):
    """PatientAuthConfirmResponseAuth unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PatientAuthConfirmResponseAuth:
        """Test PatientAuthConfirmResponseAuth
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PatientAuthConfirmResponseAuth`
        """
        model = PatientAuthConfirmResponseAuth()
        if include_optional:
            return PatientAuthConfirmResponseAuth(
                access_token = '',
                patient = openapi_client.models.patient_demographic_response.PatientDemographicResponse(
                    address = openapi_client.models.patient_address.PatientAddress(
                        district = '', 
                        line = '', 
                        pincode = '', 
                        state = '', ), 
                    gender = 'M', 
                    id = '<patient-id>@<consent-manager-id>', 
                    identifiers = [
                        openapi_client.models.identifier.Identifier(
                            type = 'MOBILE', 
                            value = '+919800083232', )
                        ], 
                    name = 'Hina Patel', 
                    year_of_birth = 2000, ),
                validity = openapi_client.models.access_token_validity.AccessTokenValidity(
                    expiry = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    limit = 1, 
                    purpose = 'LINK', 
                    requester = openapi_client.models.patient_auth_requester.PatientAuthRequester(
                        id = '100005', 
                        type = 'HIP', ), )
            )
        else:
            return PatientAuthConfirmResponseAuth(
        )
        """

    def testPatientAuthConfirmResponseAuth(self):
        """Test PatientAuthConfirmResponseAuth"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
