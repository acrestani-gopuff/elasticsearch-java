/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices.get_mapping.Request

/**
 * Get mapping definitions. For data streams, the API retrieves mappings for the
 * stream’s backing indices.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.get_mapping.Request">API
 *      specification</a>
 */

public class GetMappingRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Boolean local;

	@Nullable
	private final Time masterTimeout;

	// ---------------------------------------------------------------------------------------------

	private GetMappingRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;

	}

	public static GetMappingRequest of(Function<Builder, ObjectBuilder<GetMappingRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Comma-separated list of data streams, indices, and aliases used to limit the
	 * request. Supports wildcards (<code>*</code>). To target all data streams and
	 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * If <code>true</code>, the request retrieves information from the local node
	 * only.
	 * <p>
	 * API name: {@code local}
	 * 
	 * @deprecated 7.8.0 This parameter is a no-op and field mappings are always
	 *             retrieved locally.
	 */
	@Deprecated
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetMappingRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetMappingRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean local;

		@Nullable
		private Time masterTimeout;

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and aliases used to limit the
		 * request. Supports wildcards (<code>*</code>). To target all data streams and
		 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and aliases used to limit the
		 * request. Supports wildcards (<code>*</code>). To target all data streams and
		 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the request retrieves information from the local node
		 * only.
		 * <p>
		 * API name: {@code local}
		 * 
		 * @deprecated 7.8.0 This parameter is a no-op and field mappings are always
		 *             retrieved locally.
		 */
		@Deprecated
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetMappingRequest build() {
			_checkSingleUse();

			return new GetMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.get_mapping}".
	 */
	public static final Endpoint<GetMappingRequest, GetMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.get_mapping",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_mapping");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_mapping");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetMappingResponse._DESERIALIZER);
}
