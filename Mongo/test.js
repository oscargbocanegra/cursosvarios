<<<<<<< HEAD
show dbs = permite visualizar las bd creadas
use miprimeradb
show collections = permite ver las colecciones
=======
show dbs
use miprimeradb
>>>>>>> 3a624ca02c670a12bc57c00f720d7aff11f854ad

//Funcion para crear usuario.
db.createUser({
	user: 'oscar',
	pwd: '12345',
	roles: ['readWrite', 'dbAdmin']
});

//Busqueda en la base de datos.
db.miprimerabd.find()

<<<<<<< HEAD
//Busqueda en la base de datos un documento.
db.miprimerabd.findOne()

//Busqueda en la base de datos Formateado
db.miprimerabd.find().pretty()

//Busqueda en la base de datos con parametros.
db.miprimerabd.find({clave: 'valor'})

//Busqueda en la base de datos por object ID.
db.bd.find({_id: objectId("Codigo_Hash")})

//Busqueda en la bd por palabras.
db.bd.find({$or: [{Clave: 'valor'}, {Clave: 'valor'}]})

//Busqueda en la bd por datos mayores $gt.
db.bd.find({campoBusqueda: {$gt: valor}})

//Busqueda en la bd por datos menores $lt.
db.bd.find({campoBusqueda: {$lt: valor}})

//Busqueda en la bd por datos mayores y menores $gt - $lt.
db.bd.find({campoBusqueda: {$gt: valor, $lt: valor}})

//Busqueda en la bd por datos mayores y menores $gt - $lt.
db.bd.find().limit(#);


=======
>>>>>>> 3a624ca02c670a12bc57c00f720d7aff11f854ad
//Insertar registros.
db.miprimerabd.insert({
	firstName: 'Isaac',
	lastName: 'Asimov'
})

<<<<<<< HEAD
//Funcion para insertar datos con array.
db.bd.insert([
	{firstName: 'Isaac', lastName: 'Asimov'},
	{firstName: 'Oscar ', lastName: 'Giovanni'},
	{firstName: 'Juan ', lastName: 'Camilo'}
	])

//Actualizar valores 
db.bd.update(
	{lastName: 'valor'}, //Dato a buscar
	{
		clave: 'valor', //Valor a actualizar
		clave: 'valor', //Valor a actualizar
		//Propiedad Nueva
		clave: 'valor'
	}
)

//Actualizar dato y en caso de no existir agregarlo
db.bd.update(
	{lastName: 'valor'}, //Dato a buscar
	{
		clave: 'valor', //Valor a actualizar
		clave: 'valor', //Valor a actualizar
		//Propiedad Nueva
		clave: 'valor'
	},
	{upsert: true}
)

//Actualizar $Insertar un valor nuevo
db.bd.update(
	{_id: objectId("Codigo_Hash")},
	{lastName: 'valor'}, //Dato a buscar
	{
		//Propiedad Nueva
		$set: {clave: 'valor'}
	}
)

//Incrementar Dato partiendo de la actualizacion
db.bd.update(
	{_id: objectId("Codigo_Hash")},
	{lastName: 'valor'}, //Dato a buscar
	{
		//Propiedad Nueva
		$inc: {datoIncrementar: 'valorIncrementado'}
	}
)

//Renombrar el dato o crear en caso que no exista
db.bd.update(
	{_id: objectId("Codigo_Hash")},
	{lastName: 'valor'}, //Dato a buscar
	{
		//Propiedad Nueva
		$ren: {datoIncrementar: 'valorIncrementado'}
	}
)

*****************************
//Actualizar Documentos
uno.db












=======
>>>>>>> 3a624ca02c670a12bc57c00f720d7aff11f854ad

