# coding: utf-8

"""
    Transport Department, West Bengal

    Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.vehicle_registration_schema_certificate_data import VehicleRegistrationSchemaCertificateData

class TestVehicleRegistrationSchemaCertificateData(unittest.TestCase):
    """VehicleRegistrationSchemaCertificateData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VehicleRegistrationSchemaCertificateData:
        """Test VehicleRegistrationSchemaCertificateData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VehicleRegistrationSchemaCertificateData`
        """
        model = VehicleRegistrationSchemaCertificateData()
        if include_optional:
            return VehicleRegistrationSchemaCertificateData(
                vehicle_registration = openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration.VehicleRegistrationSchema_CertificateData_VehicleRegistration(
                    insurance = openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration_insurance.VehicleRegistrationSchema_CertificateData_VehicleRegistration_Insurance(
                        company_name = '', 
                        policy_no = '0', 
                        valid_till = '', ), 
                    vehicle = openapi_client.models.vehicle_registration_schema_certificate_data_vehicle_registration_vehicle.VehicleRegistrationSchema_CertificateData_VehicleRegistration_Vehicle(
                        chasis_no = '0', 
                        class = openapi_client.models.class.class(), 
                        color = '', 
                        cubic_capacity = openapi_client.models.cubic_capacity.cubicCapacity(), 
                        cylinder = openapi_client.models.cylinder.cylinder(), 
                        engine_no = '', 
                        fit_till = openapi_client.models.fit_till.fitTill(), 
                        fuel_desc = openapi_client.models.fuel_desc.fuelDesc(), 
                        make = openapi_client.models.make.make(), 
                        mfg_date = openapi_client.models.mfg_date.mfgDate(), 
                        model = '0', 
                        seat_capacity = '0', 
                        sleeper_capacity = '0', 
                        standing_capacity = openapi_client.models.standing_capacity.standingCapacity(), 
                        unladen_weight = '0', 
                        wheelbase = openapi_client.models.wheelbase.wheelbase(), ), 
                    financer = '0', 
                    norms_desc = 'SSCER', 
                    status_date = '0', )
            )
        else:
            return VehicleRegistrationSchemaCertificateData(
        )
        """

    def testVehicleRegistrationSchemaCertificateData(self):
        """Test VehicleRegistrationSchemaCertificateData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
