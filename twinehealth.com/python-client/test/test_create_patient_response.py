# coding: utf-8

"""
    Fitbit Plus API

    # Overview The Fitbit Plus API is a RESTful API. The requests and responses are formated according to the [JSON API](http://jsonapi.org/format/1.0/) specification.  In addition to this documentation, we also provide an [OpenAPI](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) \"yaml\" file describing the API: [Fitbit Plus API Specification](swagger.yaml).  # Authentication Authentication for the Fitbit Plus API is based on the [OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749). Fitbit Plus currently supports grant types of **client_credentials** and **refresh_token**.  See [POST /oauth/token](#operation/createToken) for details on the request and response formats. <!-- ReDoc-Inject: <security-definitions> -->  ## Building Integrations We will provide customers with unique client credentials for each application/integration they build, allowing us to enforce appropriate access controls and monitor API usage. The client credentials will be scoped to the organization, and allow full access to all patients and related data within that organization.  These credentials are appropriate for creating an integration that does one of the following:  - background reporting/analysis  - synchronizing data with another system (such as an EMR)  The API credentials and oauth flows we currently support are **not** well suited for creating a user-facing application that allows a user (patient, coach, or admin) to login and have access to data which is appropriate to that specific user. It is possible to build such an application, but it is not possible to use Fitbit Plus as a federated identity provider. You would need to have a separate means of verifying a user's identity. We do not currently support the required password-based oauth flow to make this possible.  # Paging The Fitbit Plus API supports two different pagination strategies for GET collection endpoints.  #### Skip-based paging  Skip-based paging uses the query parameters `page[size]` and `page[number]` to specify the max number of resources returned and the page number. We default to skip-based paging if there are no page parameters. The response will include a `links` object containing links to the first, last, prev, and next pages of data.  If the contents of the collection change while you are iterating through the collection, you will see duplicate or missing documents. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=1`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=2`, the first entry in the second response will be a duplicate of the last entry in the first response.  #### Cursor-based paging Cursor-based paging uses the query parameters `page[limit]` and `page[after]` to specify the max number of entries returned and identify where to begin the next page. Add `page[limit]` to the parameters to use cursor-based paging. The response will include a `links` object containing a link to the next page of data, if the next page exists.  Cursor-based paging is not subject to duplication if new resources are added to the collection. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[limit]=50`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, you will not see a duplicate entry when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[limit]=50&page[after]=<cursor>`.  We encourage the use of cursor-based paging for performance reasons.  In either form of paging, you can determine whether any resources were missed by comparing the number of fetched resources against `meta.count`. Set `page[size]` or `page[limit]` to 0 to get only the count.  It is not valid to mix the two strategies. 

    The version of the OpenAPI document: v7.78.1
    Contact: apiteam@twinehealth.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.create_patient_response import CreatePatientResponse

class TestCreatePatientResponse(unittest.TestCase):
    """CreatePatientResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreatePatientResponse:
        """Test CreatePatientResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreatePatientResponse`
        """
        model = CreatePatientResponse()
        if include_optional:
            return CreatePatientResponse(
                data = openapi_client.models.patient_resource.PatientResource(
                    attributes = openapi_client.models.patient_resource_attributes.PatientResource_attributes(
                        addresses = [
                            openapi_client.models.address.Address(
                                city = 'Cambridge', 
                                country = '', 
                                district = '', 
                                lines = ["1234 Any St."], 
                                postal_code = '02138', 
                                state = 'MA', 
                                text = '', 
                                type = '', 
                                use = '', )
                            ], 
                        archive_history = [
                            openapi_client.models.archive_history.ArchiveHistory(
                                archived = True, 
                                modified_at = '2016-06-03T13:15:22.000Z', 
                                notes = 'Patient called requesting opt out of coaching', 
                                reason = 'Opted out of coaching', )
                            ], 
                        archived = True, 
                        birth_date = 'Sun Mar 05 20:00:00 EDT 1944', 
                        email_address = 'fiona@example.com', 
                        enrolled_at = '2016-05-26T15:25:54.000Z', 
                        first_access_at = '2016-06-03T13:15:22.000Z', 
                        first_name = 'Fiona', 
                        gender = 'female', 
                        identifiers = [
                            openapi_client.models.patient_identifier.PatientIdentifier(
                                label = '', 
                                system = '', 
                                unique = True, 
                                value = '', )
                            ], 
                        invited_at = '2016-06-01T16:20:16.000Z', 
                        last_access_at = '2016-07-11T17:50:49.400Z', 
                        last_name = 'Reeves', 
                        note = 'Relies on daughter to get around', 
                        phone_numbers = [
                            openapi_client.models.phone_number.PhoneNumber(
                                primary = True, 
                                type = 'mobile', 
                                value = '555-555-1234', )
                            ], 
                        statement = openapi_client.models.patient_resource_attributes_statement.PatientResource_attributes_statement(
                            updated_at = '2016-06-03T13:15:22.000Z', 
                            updated_by = '5c509cc2f60e34018180b57c', 
                            value = 'Enjoying nature.', ), 
                        updated_at = '2016-07-11T17:13:57.027Z', ), 
                    id = '57b36ef304ad8c2224f2af3a', 
                    links = openapi_client.models.patient_resource_links.PatientResource_links(
                        self = '/patient/57b36ef304ad8c2224f2af3a', 
                        twine_web_app = 'https://app.plus.fitbit.com/#/coach/patient/5367c6300b7bb6e94188c02c/overview', ), 
                    relationships = openapi_client.models.patient_resource_relationships.PatientResource_relationships(
                        coaches = openapi_client.models.patient_resource_relationships_coaches.PatientResource_relationships_coaches(
                            data = [
                                openapi_client.models.patient_create_resource_all_of_relationships_coaches_data.PatientCreateResource_allOf_relationships_coaches_data(
                                    id = '57fee2a66b49113551658505', 
                                    meta = openapi_client.models.patient_create_resource_all_of_relationships_coaches_meta.PatientCreateResource_allOf_relationships_coaches_meta(
                                        primary = True, ), 
                                    type = 'coach', )
                                ], ), 
                        groups = openapi_client.models.patient_resource_relationships_groups.PatientResource_relationships_groups(
                            data = [
                                openapi_client.models.patient_resource_relationships_groups_data_inner.PatientResource_relationships_groups_data_inner(
                                    id = '57b3708b04ad8c2224f2af3b', 
                                    type = 'group', )
                                ], ), ), 
                    type = 'patient', ),
                meta = openapi_client.models.create_or_update_meta_response.CreateOrUpdateMetaResponse(
                    ignored = [
                        ''
                        ], 
                    req_id = '', )
            )
        else:
            return CreatePatientResponse(
                data = openapi_client.models.patient_resource.PatientResource(
                    attributes = openapi_client.models.patient_resource_attributes.PatientResource_attributes(
                        addresses = [
                            openapi_client.models.address.Address(
                                city = 'Cambridge', 
                                country = '', 
                                district = '', 
                                lines = ["1234 Any St."], 
                                postal_code = '02138', 
                                state = 'MA', 
                                text = '', 
                                type = '', 
                                use = '', )
                            ], 
                        archive_history = [
                            openapi_client.models.archive_history.ArchiveHistory(
                                archived = True, 
                                modified_at = '2016-06-03T13:15:22.000Z', 
                                notes = 'Patient called requesting opt out of coaching', 
                                reason = 'Opted out of coaching', )
                            ], 
                        archived = True, 
                        birth_date = 'Sun Mar 05 20:00:00 EDT 1944', 
                        email_address = 'fiona@example.com', 
                        enrolled_at = '2016-05-26T15:25:54.000Z', 
                        first_access_at = '2016-06-03T13:15:22.000Z', 
                        first_name = 'Fiona', 
                        gender = 'female', 
                        identifiers = [
                            openapi_client.models.patient_identifier.PatientIdentifier(
                                label = '', 
                                system = '', 
                                unique = True, 
                                value = '', )
                            ], 
                        invited_at = '2016-06-01T16:20:16.000Z', 
                        last_access_at = '2016-07-11T17:50:49.400Z', 
                        last_name = 'Reeves', 
                        note = 'Relies on daughter to get around', 
                        phone_numbers = [
                            openapi_client.models.phone_number.PhoneNumber(
                                primary = True, 
                                type = 'mobile', 
                                value = '555-555-1234', )
                            ], 
                        statement = openapi_client.models.patient_resource_attributes_statement.PatientResource_attributes_statement(
                            updated_at = '2016-06-03T13:15:22.000Z', 
                            updated_by = '5c509cc2f60e34018180b57c', 
                            value = 'Enjoying nature.', ), 
                        updated_at = '2016-07-11T17:13:57.027Z', ), 
                    id = '57b36ef304ad8c2224f2af3a', 
                    links = openapi_client.models.patient_resource_links.PatientResource_links(
                        self = '/patient/57b36ef304ad8c2224f2af3a', 
                        twine_web_app = 'https://app.plus.fitbit.com/#/coach/patient/5367c6300b7bb6e94188c02c/overview', ), 
                    relationships = openapi_client.models.patient_resource_relationships.PatientResource_relationships(
                        coaches = openapi_client.models.patient_resource_relationships_coaches.PatientResource_relationships_coaches(
                            data = [
                                openapi_client.models.patient_create_resource_all_of_relationships_coaches_data.PatientCreateResource_allOf_relationships_coaches_data(
                                    id = '57fee2a66b49113551658505', 
                                    meta = openapi_client.models.patient_create_resource_all_of_relationships_coaches_meta.PatientCreateResource_allOf_relationships_coaches_meta(
                                        primary = True, ), 
                                    type = 'coach', )
                                ], ), 
                        groups = openapi_client.models.patient_resource_relationships_groups.PatientResource_relationships_groups(
                            data = [
                                openapi_client.models.patient_resource_relationships_groups_data_inner.PatientResource_relationships_groups_data_inner(
                                    id = '57b3708b04ad8c2224f2af3b', 
                                    type = 'group', )
                                ], ), ), 
                    type = 'patient', ),
        )
        """

    def testCreatePatientResponse(self):
        """Test CreatePatientResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
