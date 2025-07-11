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

package co.elastic.clients.elasticsearch.indices.get_data_stream_options;

import co.elastic.clients.elasticsearch.indices.DataStreamOptions;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: indices.get_data_stream_options.DataStreamWithOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_stream_options.DataStreamWithOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamWithOptions implements JsonpSerializable {
	private final String name;

	@Nullable
	private final DataStreamOptions options;

	// ---------------------------------------------------------------------------------------------

	private DataStreamWithOptions(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.options = builder.options;

	}

	public static DataStreamWithOptions of(Function<Builder, ObjectBuilder<DataStreamWithOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code options}
	 */
	@Nullable
	public final DataStreamOptions options() {
		return this.options;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("name");
		generator.write(this.name);

		if (this.options != null) {
			generator.writeKey("options");
			this.options.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamWithOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamWithOptions> {
		private String name;

		@Nullable
		private DataStreamOptions options;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code options}
		 */
		public final Builder options(@Nullable DataStreamOptions value) {
			this.options = value;
			return this;
		}

		/**
		 * API name: {@code options}
		 */
		public final Builder options(Function<DataStreamOptions.Builder, ObjectBuilder<DataStreamOptions>> fn) {
			return this.options(fn.apply(new DataStreamOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamWithOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamWithOptions build() {
			_checkSingleUse();

			return new DataStreamWithOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamWithOptions}
	 */
	public static final JsonpDeserializer<DataStreamWithOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamWithOptions::setupDataStreamWithOptionsDeserializer);

	protected static void setupDataStreamWithOptionsDeserializer(ObjectDeserializer<DataStreamWithOptions.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::options, DataStreamOptions._DESERIALIZER, "options");

	}

}
